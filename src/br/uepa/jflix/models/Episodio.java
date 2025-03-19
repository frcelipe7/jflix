package br.uepa.jflix.models;
import br.uepa.jflix.utils.Classificavel;

public class Episodio implements Classificavel {
    private int numeroEpisodio;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public int getNumeroEpisodio() {
        return this.numeroEpisodio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Serie getSerie() {
        return this.serie;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getTotalVisualizacoes() {
        return this.totalVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        }
        return 2;
    }
}
