package Desafio.ApiExercise;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        var scanner = new Scanner(System.in);
        var cep = "";

        while(!cep.equalsIgnoreCase("sair")){
            System.out.println("Digite o CEP para consulta: ");
            cep = scanner.nextLine();

            if (cep.equalsIgnoreCase("sair")){
                break;
            }

            ConsultaCep consultaCep = new ConsultaCep();

            try {
                Endereco novoEndereco = consultaCep.buscaEndereco(cep);
                System.out.println(novoEndereco);
                GeradorJson gerador = new GeradorJson();
                gerador.gerarJson(novoEndereco);
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando a Aplicação.");

            }
             
        }
        System.out.println("Sistema finalizado com sucesso!");

    }
}
