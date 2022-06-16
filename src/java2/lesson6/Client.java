package java2.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        try {
            openConnection();
            Scanner scanner = new Scanner(System.in);
            while (!socket.isClosed()) {
                sendMessage(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Сервер не запущен");
        }
    }

    private void sendMessage (String message){
        if (!Objects.equals(message, "") && !socket.isClosed()) {
            try {
                out.writeUTF(message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void openConnection() throws IOException {
        socket = new Socket(Constants.ADDRESS, Constants.PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
            try {
                while (!socket.isClosed()){
                    final String message = in.readUTF();
                    System.out.println("Сервер: " + message);
                    if (Constants.STOP_MESSAGE.equalsIgnoreCase(message)){
                        closeConnection();
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                closeConnection();
            }
        }).start();
    }

    private void closeConnection() {
        System.out.println("Соединение разрывается...");

        if (in != null){
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (out != null){
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (socket != null){
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.exit(0);
    }
}

