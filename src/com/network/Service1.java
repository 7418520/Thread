package com.network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) throws IOException {
//     服务端需要使用servicesocket来开放本地端口
        ServerSocket serverSocket=new ServerSocket(10086);
//        需要接受client传过来的数据，需要定义socket对象
        Socket server=serverSocket.accept();
//         通过server获取输入流对象
        InputStream inputStream=server.getInputStream();

//对输入流进行包装，包装成DataInputStream
        DataInputStream dataInputStream=new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println(s);
        dataInputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();

    }
}
