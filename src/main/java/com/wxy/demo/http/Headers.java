package com.wxy.demo.http;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * @Author wxy
 * @Date 19-9-17 上午10:47
 * @Description TODO
 **/
public class Headers {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://www.baidu.com")
                .header("User-Agent", "My super agent")
                .addHeader("Accept", "text/html")
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("服务器端错误: " + response);
        }
        System.out.println(response.header("Server"));
        System.out.println(response.headers("Set-Cookie"));
    }
}
