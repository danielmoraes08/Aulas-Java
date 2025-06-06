package Desafio.ApiExercise;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeradorJson {

    List<Endereco> enderecos = new ArrayList<>();

    public void gerarJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        enderecos.add(endereco);

        FileWriter writer = new FileWriter("cep.json");
        writer.write(gson.toJson(enderecos));
        writer.close();

    }

}


