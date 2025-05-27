// Exercise 35 - TCP Client-Server Chat
// Server.java
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started...");

        Socket clientSocket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String message;
        while ((message = in.readLine()) != null) {
            System.out.println("Client: " + message);
            out.println("Echo: " + message);
        }

        clientSocket.close();
        serverSocket.close();
    }
}

// Client.java
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String input;
        while ((input = userInput.readLine()) != null) {
            out.println(input);
            System.out.println("Server: " + in.readLine());
        }

        socket.close();
    }
}
