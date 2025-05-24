package com.alura.conversorDeMoneda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class Conversor {
    private static final String API_KEY = "TU_API_KEY";  // ← Reemplazar con tu clave
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    private static class ApiResponse {
        String result;
        double conversion_rate;
    }

    public double obtenerTasaCambio(String origen, String destino) throws Exception {
        String url = BASE_URL + origen + "/" + destino;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Revisar si la comunicacion fue exitosa
        if (response.statusCode() != 200) {
            throw new RuntimeException("Error HTTP: " + response.statusCode());
        }

        Gson gson = new Gson();
        ApiResponse api = gson.fromJson(response.body(), ApiResponse.class);

        if (!"success".equals(api.result)) {
            throw new RuntimeException("Respuesta de la API inválida.");
        }

        return api.conversion_rate;
    }

    public double convertir(double cantidad, double tasa) {
        return cantidad * tasa;
    }
}
