package in.aditya.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class BroadcastServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4444);
        System.out.println("Server is up....");
        System.out.println("Open port: 4444");
        Socket clientSocket = serverSocket.accept();
        System.out.println("some request...");
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));

    }
}
