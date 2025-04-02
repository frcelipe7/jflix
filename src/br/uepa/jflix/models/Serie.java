package br.uepa.jflix.models;
import br.uepa.jflix.utils.ClassificacaoIndicativa;

import static br.uepa.jflix.models.Colors.*;

public class Serie extends Titulo implements ClassificacaoIndicativa{
    private int temporadas;
    private boolean ativada;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtivada() {
        return ativada;
    }

    public void setAtivada(boolean ativada) {
        this.ativada = ativada;
    }

    public int getEpisodiosPorTemporada() {
        return this.episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return (this.minutosPorEpisodio * this.temporadas * this.episodiosPorTemporada);
    }

    public boolean verificarPodeAssistir(Usuario user) {
        return podeAssistir(user, this.getClassificacaoIndicativa(), this.getNomeDoTitulo());
    }
}
