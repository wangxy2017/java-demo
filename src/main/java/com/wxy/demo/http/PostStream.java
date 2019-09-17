package com.wxy.demo.http;

import com.squareup.okhttp.*;
import okio.BufferedSink;

import java.io.IOException;

/**
 * @Author wxy
 * @Date 19-9-17 上午10:53
 * @Description TODO
 **/
public class PostStream {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        final MediaType MEDIA_TYPE_TEXT = MediaType.parse("text/plain");
        final String postBody = "Hello World";

        RequestBody requestBody = new RequestBody() {
            @Override
            public MediaType contentType() {
                return MEDIA_TYPE_TEXT;
            }

            @Override
            public void writeTo(BufferedSink sink) throws IOException {
                sink.writeUtf8(postBody);
            }

            @Override
            public long contentLength() throws IOException {
                return postBody.length();
            }
        };
        Request request = new Request.Builder()
                .url("http://www.baidu.com")
                .post(requestBody)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("服务器端错误: " + response);
        }

        System.out.println(response.body().string());
    }
}
