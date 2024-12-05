package br.uepa.jflix.modelos;

public class Serie extends Titulo{
    public Serie(String nomeDoTitulo, int anoLancamento, boolean incluidoNoPlano, double notaDoTitulo, int avaliacao, int qtdDeAvaliacoes, String sinopse, int duracaoEmMinutos) {
        super(nomeDoTitulo, anoLancamento, incluidoNoPlano, notaDoTitulo, avaliacao, qtdDeAvaliacoes, sinopse, duracaoEmMinutos);
    }
}
