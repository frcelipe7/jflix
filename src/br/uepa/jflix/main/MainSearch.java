package br.uepa.jflix.main;

import br.uepa.jflix.models.Titulo;
import br.uepa.jflix.models.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        // http://www.omdbapi.com/?apikey=[apikey]&t=[titulo]
        String api_url = "http://www.omdbapi.com/";
        String api_key = "11c74a87";

        // input do filme feito pelo user
        System.out.print("Insira o nome do filme: ");
        Scanner userScan = new Scanner(System.in);
        Scanner userScanBusca = new Scanner(System.in);
        String busca = userScanBusca.nextLine();

        System.out.println("Buscando pelo filme \"" + busca + "\"");
        String restUrl = URLEncoder.encode(busca, "UTF-8");

        // requisição assincrona
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(api_url+"?"+"apikey="+api_key+"&"+"t="+restUrl))
                .build();
        CompletableFuture<HttpResponse<String>> future =
                client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        // loading
        while(!future.isDone()) {
            System.out.print("\r-");
            Thread.sleep(200);
            System.out.print("\r\\");
            Thread.sleep(200);
            System.out.print("\r|");
            Thread.sleep(200);
            System.out.print("\r/");
            Thread.sleep(200);
            System.out.print("\r-");
            Thread.sleep(200);
            System.out.print("\r/");
            Thread.sleep(200);
        }

        // exibindo informacoes do filme
        String body = future.thenApply(HttpResponse::body).join();
        System.out.println("\r- Exibindo informações do filme: ----\n");
        System.out.println(body + "\n");


        // finalizando o scan
        userScanBusca.close();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOmdb tituloOmdb = gson.fromJson(body, TituloOmdb.class);

        try {
            Titulo titulo = new Titulo(tituloOmdb);
            System.out.println("O titulo convertido é: " + titulo);
        } catch (NumberFormatException e) {
            System.out.println("Tá pegando fogo bicho");
            System.out.println(e.getMessage());
        }
        System.out.println("O nome do titulo é: " + tituloOmdb);
    }
}


//        FAZENDO BUSCAS SINCRONAS
//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();


//                .whenCompleteAsync((response, throwable) -> {
//                    if (throwable != null) {
//                        System.out.println("Erro na requisição: " + throwable.getMessage());
//                    } else {
//                        System.out.println("Requisição finalizada com sucesso.");
//                    }
//                })

//        System.out.println(response.body());