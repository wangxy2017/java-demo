package com.wxy.demo.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Author wxy
 * @Date 19-8-26 下午2:09
 * @Description TODO
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 8888);
        InputStream is = client.getInputStream();
        DataInputStream in = new DataInputStream(is);
        System.out.println("服务器响应： " + in.readUTF());
        client.close();
    }
}
