package br.uepa.jflix.modelos;

public class Filme {
    ////////////////////////////////////////////////
    // ATRIBUTOS
    ///////////////////////////////////////////////
    private String nomeDoFilme;
    private int anoLancamento = 0;
    private boolean incluidoNoPlano;
    private double notaDoFilme;
    private int avaliacao;
    private int qtdDeAvaliacoes;
    private String sinopse;
    private int duracaoEmMinutos;
    private double somaNotaAvaliacao;


    ////////////////////////////////////////////////
    // METODOS
    ///////////////////////////////////////////////

    // construtor
    public Filme(String nomeDoFilme, int anoLancamento, boolean incluidoNoPlano, double notaDoFilme, int avaliacao, int qtdDeAvaliacoes, String sinopse, int duracaoEmMinutos) {
        this.nomeDoFilme = nomeDoFilme;
        this.anoLancamento = anoLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.notaDoFilme = notaDoFilme;
        this.avaliacao = avaliacao;
        this.qtdDeAvaliacoes = qtdDeAvaliacoes;
        this.sinopse = sinopse;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.somaNotaAvaliacao = 0;
    }

    // serialize method
    public String serialize() {
        String message =  String.format("""
                {
                    "nomeDoFilme": "%s",
                    "anoLancamento": "%d",
                    "incluidoNoPlano": "%b",
                    "notaDoFilme": "%f",
                    "avaliacao": "%d",
                    "qtdDeAvaliacoes": "%d",
                    "sinopse": "%s",
                    "duracaoEmMunitos": "%d"
                  };
                """, this.nomeDoFilme, this.anoLancamento, this.incluidoNoPlano, this.notaDoFilme, this.avaliacao, this.qtdDeAvaliacoes, this.sinopse, this.duracaoEmMinutos);
        message.replaceAll("\\s+", " ");

        return message;
    }

    public void avalia(double notaDoFilme) {
        somaNotaAvaliacao += notaDoFilme;
        qtdDeAvaliacoes++;
    }

    public double mediaNotas() {
        return somaNotaAvaliacao/qtdDeAvaliacoes;
    }

    // set & get
    public void setNomeDoFilme(String nome) {
        this.nomeDoFilme = nome;
    }

    public String getNomeDoFilme() {
        return this.nomeDoFilme;
    }

    public void setAnoLancamento(int ano) {
        this.anoLancamento = ano;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluido) {
        this.incluidoNoPlano = incluido;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setNotaDoFilme(double nota) {
        this.notaDoFilme = nota;
    }

    public double getNotaDoFilme() {
        return this.notaDoFilme;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setQtdDeAvaliacoes(int total) {
        this.qtdDeAvaliacoes = total;
    }

    public int getQtdDeAvaliacoes() {
        return this.qtdDeAvaliacoes;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getSinopse() {
        return this.sinopse;
    }

    public void setDuracaoEmMinutos(int duracao) {
        this.duracaoEmMinutos = duracao;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }
}
