package br.com.alura.screenmatch.PraticaDeAtividade;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Barbara\",\"idade\":22,\"cidade\":\"São Paulo\"}";

        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
