package br.com.alura.fipe.service;

import br.com.alura.fipe.model.Modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;

public class ConsumoApi {

    public String obterDados(String endereco, Class<Modelos> modelosClass) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch(HttpTimeoutException e){
            System.err.println("A solicitação excedeu o tempo limite: " + e.getMessage());
        } catch(IOException e){
            System.err.println("Erro de IO: " + e.getMessage());
        } catch(InterruptedException e){
            System.err.println("A solicitação foi interrompida: " + e.getMessage());
        }

        String json = response.body();
        return json;
    }
}

