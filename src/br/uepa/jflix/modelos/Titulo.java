package br.uepa.jflix.modelos;

public class Titulo {
    ////////////////////////////////////////////////
    // ATRIBUTOS
    ///////////////////////////////////////////////

    private String nomeDoTitulo;
    private int anoLancamento = 0;
    private boolean incluidoNoPlano;
    private double notaDoTitulo;
    private int avaliacao;
    private int qtdDeAvaliacoes;
    private String sinopse;
    private int duracaoEmMinutos;
    private double somaNotaAvaliacao;

    ////////////////////////////////////////////////
    // METODOS
    ///////////////////////////////////////////////

    // construtor
    public Titulo(String nomeDoTitulo, int anoLancamento, boolean incluidoNoPlano, double notaDoTitulo, int avaliacao, int qtdDeAvaliacoes, String sinopse, int duracaoEmMinutos) {
        this.nomeDoTitulo = nomeDoTitulo;
        this.anoLancamento = anoLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.notaDoTitulo = notaDoTitulo;
        this.avaliacao = avaliacao;
        this.qtdDeAvaliacoes = qtdDeAvaliacoes;
        this.sinopse = sinopse;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.somaNotaAvaliacao = 0;
    }

    public String display() {
        String message =  String.format("""
                    Nome: %s,
                    Ano de Lançamento: %d,
                    Incluído no Plano: %b,
                    Nota: %f,
                    Avaliação: %d,
                    Quantidade de Avaliações: %d,
                    Sinopse: %s,
                    Duração em Minutos: %d
                """, this.nomeDoTitulo, this.anoLancamento, this.incluidoNoPlano, this.notaDoTitulo, this.avaliacao, this.qtdDeAvaliacoes, this.sinopse, this.duracaoEmMinutos);

        message = message.replaceAll(" {4}", "");

        return message;
    }

    // serialize method
    public String serialize() {
        String message =  String.format("""
                {"nomeDoTitulo": "%s",
                 "anoLancamento": "%d",
                 "incluidoNoPlano": "%b",
                 "notaDoTitulo": "%f",
                 "avaliacao": "%d",
                 "qtdDeAvaliacoes": "%d",
                 "sinopse": "%s",
                 "duracaoEmMunitos": "%d"};
                """, this.nomeDoTitulo, this.anoLancamento, this.incluidoNoPlano, this.notaDoTitulo, this.avaliacao, this.qtdDeAvaliacoes, this.sinopse, this.duracaoEmMinutos);

        // message = message.replaceAll("\\n", " ");
        message = message.replaceAll("\\s+", " ");

        return message;
    }

    public void avalia(double notaDoTitulo) {
        somaNotaAvaliacao += notaDoTitulo;
        qtdDeAvaliacoes++;
    }

    public double mediaNotas() {
        return somaNotaAvaliacao/qtdDeAvaliacoes;
    }

    // set & get
    public void setNomeDoTitulo(String nomeDoTitulo) {
        this.nomeDoTitulo = nomeDoTitulo;
    }

    public String getNomeDoTitulo() {
        return this.nomeDoTitulo;
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

    public boolean isIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setNotaDoTitulo(double nota) {
        this.notaDoTitulo = nota;
    }

    public double getNotaDoTitulo() {
        return this.notaDoTitulo;
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
