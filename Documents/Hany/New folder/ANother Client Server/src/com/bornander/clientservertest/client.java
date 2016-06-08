package com.bornander.clientservertest;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
 
public class client {
 
    public void go() throws IOException {
        System.out.println("Getting some good advice...");
        Socket socket = new Socket("localhost", 8080);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String advice = reader.readLine();
        System.out.println(advice);
        reader.close();
        socket.close();
    }
    
    public static void main(String[] args) throws IOException {
        client client = new client();
        client.go();
    }
}
