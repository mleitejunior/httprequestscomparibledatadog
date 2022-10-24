package app.client;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public class GoogleHttpClientImpl {

    public static void get(String url) throws IOException {

        HttpRequestFactory requestFactory
                = new NetHttpTransport().createRequestFactory();
        HttpRequest request = requestFactory.buildGetRequest(
                new GenericUrl(url));

        HttpResponse execute = request.execute();

//        System.out.println("GoogleHttpClientFluent statusCode: " + execute.getStatusCode());
    }
}
