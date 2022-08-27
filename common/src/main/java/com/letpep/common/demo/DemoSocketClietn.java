package com.letpep.common.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class DemoSocketClietn {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",6666);
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("hello socket Server".getBytes());

    }
}
