package com.cibertec;

import java.net.Socket;

public class cliente {
    private static final int PORT = 13;
    private static final String HOST = "localhost";

    public cliente(){
        try(Socket socket = new Socket(HOST,PORT)) {
          System.out.println("1 >> Conected to server on port " + PORT);
          System.out.println("2 >> complete ");
          socket.close();  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new cliente();
    }
}
