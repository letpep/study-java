package com.letpep.common.demo;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DemoSocketServer {


    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);
        while (true){
            Socket connection = server.accept();
            Reader reader = new InputStreamReader(connection.getInputStream(),"UTF-8");
            char[] r = new char[1111];
            int len = reader.read(r);
            String s = new String(r, 0, len);
            System.out.println( s);
            Writer out = new OutputStreamWriter(connection.getOutputStream());
            Date now = new Date();
            out.write(now.toString() + "\r\n");
            out.flush();
            connection.close();

        }
    }
}
