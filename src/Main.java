public class Main {
    public static void main(String[] args) {
        String nomeDoFilme = "Moana 2";
        int anoLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 10.0;
        int avaliacao = 10;
        int totalDeAvaliacoes = 1;
        String sinopse = "Esta é a sinopse do filme Moana 2";
        int duracaoEmMinutos = 150;

        Filme meuFilme = new Filme(nomeDoFilme, anoLancamento, incluidoNoPlano, notaDoFilme, avaliacao, totalDeAvaliacoes, sinopse, duracaoEmMinutos);

        String filmeJson = meuFilme.serialize();

        System.out.println(filmeJson);

        String nome = meuFilme.getNomeDoFilme();

        System.out.println(nome);
    }
}
