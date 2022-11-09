package app.client;

import okhttp3.Request;
import okhttp3.Response;
import okhttp3.OkHttpClient;

import java.io.IOException;

public class OkHttpClientImpl {

    public static void get(String url) throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
//            System.out.println("OkHttpClient statusCode: " + response.code());
//            System.out.println("OkHttpClient body: " + response.body().string());
        }
    }
}
