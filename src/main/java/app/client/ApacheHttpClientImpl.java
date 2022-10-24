package app.client;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.HttpResponse;

import java.io.IOException;

public class ApacheHttpClientImpl {

    public static void get(String url) throws IOException {

        HttpResponse httpResponse = Request.get(url)
                .execute().returnResponse();

//        System.out.println("ApacheHttpClientFluent5 statusCode: " + httpResponse.getCode());
    }
}
