package java2.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

public class Server {
    private DataInputStream in;
    private DataOutputStream out;
    private Socket socket;

    public static void main(String[] args) {
        new Server().run();
    }

    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(Constants.PORT)) {
            System.out.println("Ждем подключения клиента...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            Scanner scanner = new Scanner(System.in);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            sendMessage("Добро пожаловать");

            new Thread(() -> {
                while (!socket.isClosed()) {
                    final String message;
                    try {
                        message = in.readUTF();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Клиент: " + message);
                    if (Constants.STOP_MESSAGE.equalsIgnoreCase(message)) {
                        sendMessage(Constants.STOP_MESSAGE);
                        closeConnection();
                    }
                }
            }).start();

            while (!socket.isClosed()) {
                final String sentMessage;
                sentMessage = scanner.nextLine();
                sendMessage(sentMessage);
                if (Constants.STOP_MESSAGE.equalsIgnoreCase(sentMessage)){
                    closeConnection();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        System.out.println("Соединение разрывается...");

        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.exit(0);
    }

    private void sendMessage(String message) {
        if (!Objects.equals(message, "") && !socket.isClosed()) {
            try {
                out.writeUTF(message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
