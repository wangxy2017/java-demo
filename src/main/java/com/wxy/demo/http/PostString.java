package com.wxy.demo.http;

import com.squareup.okhttp.*;

import java.io.IOException;

/**
 * @Author wxy
 * @Date 19-9-17 上午10:50
 * @Description TODO
 **/
public class PostString {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        MediaType MEDIA_TYPE_TEXT = MediaType.parse("text/plain");
        String postBody = "Hello World";

        Request request = new Request.Builder()
                .url("http://www.baidu.com")
                .post(RequestBody.create(MEDIA_TYPE_TEXT, postBody))
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("服务器端错误: " + response);
        }

        System.out.println(response.body().string());
    }
}
