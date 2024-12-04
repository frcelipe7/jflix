public class Filme {
    ////////////////////////////////////////////////
    // ATRIBUTOS
    ///////////////////////////////////////////////
    private String nomeDoFilme;
    private int anoLancamento = 0;
    private boolean incluidoNoPlano;
    private double notaDoFilme;
    private int avaliacao;
    private int totalDeAvaliacoes;
    private String sinopse;
    private int duracaoEmMinutos;

    ////////////////////////////////////////////////
    // METODOS
    ///////////////////////////////////////////////

    // construtor
    public Filme(String nomeDoFilme, int anoLancamento, boolean incluidoNoPlano, double notaDoFilme, int avaliacao, int totalDeAvaliacoes, String sinopse, int duracaoEmMinutos) {
        this.nomeDoFilme = nomeDoFilme;
        this.anoLancamento = anoLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.notaDoFilme = notaDoFilme;
        this.avaliacao = avaliacao;
        this.totalDeAvaliacoes = totalDeAvaliacoes;
        this.sinopse = sinopse;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // serialize method
    public String serialize() {
        return "{\"nomeDoFilme\": \"" + this.nomeDoFilme + "\", \"anoLancamento\": " + this.anoLancamento + ", \"incluidoNoPlano\": " + this.incluidoNoPlano + ", \"notaDoFilme\": " + this.notaDoFilme + ", \"avaliacao\": " + this.avaliacao + ", \"totalDeAvaliacoes\": " + this.totalDeAvaliacoes + ", \"sinopse\": \"" + this.sinopse + "\", \"duracaoEmMunitos\": " + this.duracaoEmMinutos + "}";
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

    public void setTotalDeAvaliacoes(int total) {
        this.totalDeAvaliacoes = total;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
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
