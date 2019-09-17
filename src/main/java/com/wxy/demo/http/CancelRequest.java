package com.wxy.demo.http;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Author wxy
 * @Date 19-9-17 上午11:13
 * @Description TODO
 **/
public class CancelRequest {
    private OkHttpClient client = new OkHttpClient();
    private String tag = "website";

    public void sendAndCancel() {
        sendRequests(Arrays.asList(
                "http://www.baidu.com",
                "http://www.163.com",
                "http://www.sina.com.cn"));
        client.cancel(this.tag);
    }

    public void sendRequests(List<String> urls) {
        urls.forEach(url -> {
            client.newCall(new Request.Builder()
                    .url(url)
                    .tag(this.tag)
                    .build())
                    .enqueue(new SimpleCallback());
        });
    }

    private static class SimpleCallback implements Callback {

        public void onFailure(Request request, IOException e) {
            e.printStackTrace();
        }

        public void onResponse(Response response) throws IOException {
            System.out.println(response.body().string());
        }
    }
    public static void main(String[] args) throws IOException {
        new CancelRequest().sendAndCancel();
    }
}
