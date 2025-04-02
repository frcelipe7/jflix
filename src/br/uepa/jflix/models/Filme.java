package br.uepa.jflix.models;
import br.uepa.jflix.utils.Classificavel;
import br.uepa.jflix.utils.ClassificacaoIndicativa;

import static br.uepa.jflix.models.Colors.*;

public class Filme extends Titulo implements Classificavel, ClassificacaoIndicativa {
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

    public boolean verificarPodeAssistir(Usuario user) {
        return podeAssistir(user, this.getClassificacaoIndicativa(), this.getNomeDoTitulo());
    }
}
