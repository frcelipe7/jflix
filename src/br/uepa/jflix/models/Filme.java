package br.uepa.jflix.models;
import br.uepa.jflix.utils.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return this.diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (mediaNotas()/2);
    }
}
