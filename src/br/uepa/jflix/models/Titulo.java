package br.uepa.jflix.models;

public class Titulo {
    private String nomeDoTitulo;
    private int anoLancamento = 0;
    private boolean incluidoNoPlano;
    private double notaDoTitulo;
    private int avaliacao;
    private int qtdDeAvaliacoes;
    private String sinopse;
    private int duracaoEmMinutos;
    private double somaNotaAvaliacao;
    private int classificacaoIndicativa;

    public Titulo(String nomeDoTitulo, int anoLancamento, int classificacaoIndicativa) {
        this.nomeDoTitulo = nomeDoTitulo;
        this.anoLancamento = anoLancamento;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    private String charAniquilator(String receivedString) {
        if (receivedString.equals("N/A")) {
            return "-1";
        }

        StringBuilder finalString = new StringBuilder();

        for (String i : receivedString.split("")) {
            try {
                Integer.parseInt(i);
                finalString.append(i);
            } catch (NumberFormatException e) {}
        }

        return finalString.toString();
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nomeDoTitulo = tituloOmdb.title();
        this.anoLancamento = Integer.parseInt(charAniquilator(tituloOmdb.year()));
        this.duracaoEmMinutos = Integer.parseInt(charAniquilator(tituloOmdb.runtime()));
    }

    public String showInfo() {
        String message =  String.format("""
                    Nome: %s,
                    Ano de Lançamento: %d,
                    Incluído no Plano: %b,
                    Nota: %f,
                    Avaliação: %d,
                    Soma avaliações: %f,
                    Quantidade de Avaliações: %d,
                    Sinopse: %s,
                    Duração em Minutos: %d
                """, this.nomeDoTitulo, this.anoLancamento, this.incluidoNoPlano, this.notaDoTitulo, this.avaliacao, this.somaNotaAvaliacao, this.qtdDeAvaliacoes, this.sinopse, this.duracaoEmMinutos);

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
        this.somaNotaAvaliacao = this.somaNotaAvaliacao + notaDoTitulo;
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

    public int getClassificacaoIndicativa() {
        return this.classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNomeDoTitulo() + " | " + "Ano de lançamento: " + this.getAnoLancamento() + " | " + "Duração: " + this.getDuracaoEmMinutos() + " | " ;
    }
}
