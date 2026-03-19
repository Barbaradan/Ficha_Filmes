package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme ("O poderoso chefão", 1970);
        meuFilme.avalia(5);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(7);
        Filme filmeDaBabis = new Filme("Crepusculo", 2008);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaBabis);
        lista.add(meuFilme);
        lista.add(lost);

        //foreach
        for(Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Ian Somerhaulder");
        buscaArtista.add("Park BoGum");

        //uso do collections
        Collections.sort(buscaArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaArtista);
        System.out.println("Lista de titulos ordenados:" );

        Collections.sort(lista);
        System.out.println(lista);

        //forma curta e moderna do comparator 
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando pelo ano: ");
        System.out.println(lista);
    }
}
