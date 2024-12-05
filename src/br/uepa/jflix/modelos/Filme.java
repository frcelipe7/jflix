package br.uepa.jflix.modelos;

public class Filme extends Titulo {
    private String diretor;

    public Filme(String nomeDoTitulo, int anoLancamento, boolean incluidoNoPlano, double notaDoTitulo, int avaliacao, int qtdDeAvaliacoes, String sinopse, int duracaoEmMinutos) {
        super(nomeDoTitulo, anoLancamento, incluidoNoPlano, notaDoTitulo, avaliacao, qtdDeAvaliacoes, sinopse, duracaoEmMinutos);
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return this.diretor;
    }
}
