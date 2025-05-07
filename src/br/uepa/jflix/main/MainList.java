package br.uepa.jflix.main;

import br.uepa.jflix.models.Filme;
import br.uepa.jflix.models.Serie;
import br.uepa.jflix.models.Titulo;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        // criando filmes
        Filme filme1 = new Filme("Gladiador", 2000, 14);
        Filme filme2 = new Filme("Up", 2010, 0);
        filme1.avalia(10);
        filme1.avalia(10);

        // criando series
        Serie serie1 = new Serie("Breaking Bad", 2014, 18);
        serie1.avalia(8);

        // criando catalogo
        ArrayList<Titulo> catalogo = new ArrayList<Titulo>();

        // adicionando filmes no catalogo
        catalogo.add(filme1);
        catalogo.add(filme2);
        catalogo.add(serie1);

        System.out.println("|------------------------|\n|- Consultando catalogo -|\n|------------------------|");
        for (Titulo item : catalogo) {
            System.out.println("|-Item: " + item.getNomeDoTitulo());
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("| Avaliação: " + "*".repeat((int) ((Filme) item).getClassificacao()));
            } else  {
                Serie serie = (Serie) item;
                System.out.println("| Avaliação: " + "nota serie");
            }
            System.out.println("|------------------------|");

        }
    }
}
