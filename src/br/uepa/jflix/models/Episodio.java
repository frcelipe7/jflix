package br.uepa.jflix.models;
import br.uepa.jflix.utils.Classificavel;
import br.uepa.jflix.utils.ClassificacaoIndicativa;

import static br.uepa.jflix.models.Colors.*;

public class Episodio implements Classificavel, ClassificacaoIndicativa {
    private int numeroEpisodio;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;
    private int classificacaoIndicativaEpisodio = 16;

    public int getClassificacaoIndicativaEpisodio() {
        return classificacaoIndicativaEpisodio;
    }

    public void setClassificacaoIndicativaEpisodio(int classificacaoIndicativaEpisodio) {
        this.classificacaoIndicativaEpisodio = classificacaoIndicativaEpisodio;
    }


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

    public boolean verificarPodeAssistir(Usuario user) {
        return podeAssistir(user, this.getClassificacaoIndicativaEpisodio(), this.getNome());
    }
}
