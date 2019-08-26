package com.wxy.demo.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author wxy
 * @Date 19-8-26 下午2:14
 * @Description TODO
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        OutputStream os = socket.getOutputStream();
        DataOutputStream out = new DataOutputStream(os);
        out.writeUTF("欢迎光临！");
        server.close();
    }
}
