package com.bornander.clientservertest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
 
public class server {
    
    private final static Random random = new Random();
    private final static String[] ADVICE_LIST = {
        "Take smaller bites", 
        "Go for the tight jeans. No they do NOT make you look fat.", 
        "One word: inappropriate", 
        "Just for today, be honest. Tell yourboss what you *really* think", 
        "You might want to rethink that haircut."
    };
 
    private void go() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while(!serverSocket.isClosed()) {
            Socket socket = serverSocket.accept();
            
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            String advice = getAdvice();
            System.out.println("Sending advice: " + advice);
            writer.write(advice);
            writer.close();
            System.out.println("Advice sent!");
            socket.close();
        }
    }
    
    private static String getAdvice() {
        return ADVICE_LIST[random.nextInt() % ADVICE_LIST.length];
    }
    
    public static void main(String[] args) throws IOException {
        
        server server = new server();
        server.go();
    }
}