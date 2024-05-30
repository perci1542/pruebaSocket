package com.cibertec;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private final int PORT = 13;
    public Server(){
         try(ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.println("1>> Server started on port" + PORT);
            while (true) {
                System.out.println("2 >> Waiting for Client Conection................");
                Socket clienSocket = serverSocket.accept();
                System.out.print("3 >> New client connected : " + clienSocket.getInetAddress().getHostAddress());
                System.out.print("4 >> Cliente completo");
                clienSocket.close();
                System.out.println("5 >> Cliente Desconectado");
            }
         }
         catch(IOException e){
            e.printStackTrace();
         } 
    }

    public static void main(String[] args) {
        new Server();
    }
}
