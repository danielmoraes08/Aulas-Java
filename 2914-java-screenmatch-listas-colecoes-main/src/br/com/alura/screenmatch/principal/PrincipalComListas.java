package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(5);
        Filme filmeLegal = new Filme("Legal",2008);
        filmeLegal.avalia(7);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeLegal);
        lista.add(lost);

        for (Titulo item: lista){
           System.out.println(item.getNome());
           if (item instanceof Filme filme){
               System.out.println("Classificação: " + ((Filme) item).getClassificacao());
           }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Will Smith");
        buscaPorArtista.add("Tom Cruise");

        Collections.sort(buscaPorArtista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
