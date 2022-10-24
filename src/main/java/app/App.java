package app;

import app.client.ApacheHttpClientImpl;
import app.client.GoogleHttpClientImpl;
import app.client.OkHttpClientImpl;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String url = "https://google.com.br";

        long referenceTime = System.currentTimeMillis();

        System.out.println("OKHTTPCLIENT testes");
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();

        System.out.println("GOOGLEHTTP testes");
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();

        System.out.println("APACHEHTTP testes");
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();


        System.out.println("OKHTTPCLIENT testes");
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        OkHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();

        System.out.println("GOOGLEHTTP testes");
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        GoogleHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();

        System.out.println("APACHEHTTP testes");
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();
        ApacheHttpClientImpl.get(url);
        timeSpent(referenceTime);
        referenceTime = System.currentTimeMillis();

        System.out.println("ENCERRADOS");
    }

    private static void timeSpent(long referenceTime) {
        System.out.println("Tempo em milli segundos: "+ (System.currentTimeMillis() - referenceTime));
    }
}
