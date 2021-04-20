package com.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
//        创建socket对象，其实就是开启实现IO的虚拟接口，此接口不是Java中的接口类似于网线
//        需要指定接收方的IP地址和端口号
        Socket client =new Socket("localhost",10086);
//              获取输出流对象，向服务端发送数据
        OutputStream outputStream = client.getOutputStream();

        DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("hello,nihao");
        dataOutputStream.close();
        outputStream.close();
        client.close();
    }
}
