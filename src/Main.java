import br.uepa.jflix.modelos.Filme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        String nomeDoFilme = "Moana 2";
        int anoLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 10.0;
        int avaliacao = 10;
        int totalDeAvaliacoes = 1;
        String sinopse = "Esta é a sinopse do filme Moana 2";
        int duracaoEmMinutos = 150;

        br.uepa.jflix.modelos.Filme meuFilme = new br.uepa.jflix.modelos.Filme(nomeDoFilme, anoLancamento, incluidoNoPlano, notaDoFilme, avaliacao, totalDeAvaliacoes, sinopse, duracaoEmMinutos);

        String filmeJson = meuFilme.serialize();

        System.out.println(filmeJson);

        String nome = meuFilme.getNomeDoFilme();

        System.out.println(nome);

         */

        int op = 0;
        Scanner userOp = new Scanner(System.in);
        Scanner userInputFilme = new Scanner(System.in);

        Filme filme = new Filme("Default", 2000, false, 0.0, 0, 0, "Default", 0);

        while (op != 4) {
            System.out.println("\n--------------------------");
            System.out.println("O que você deseja fazer?");
            System.out.println(" [1] - Cadastrar filme;");
            System.out.println(" [2] - Exibir informações do filme;");
            System.out.println(" [3] - Avaliar;");
            System.out.println(" [4] - Sair;");

            op = userOp.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nCadastro de filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");

                    System.out.println("Insira o nome do filme: ");
                    String nome = userInputFilme.nextLine();

                    System.out.println("Insira a sinopse do filme: ");
                    String sinopse = userInputFilme.nextLine();

                    System.out.println("Insira o ano de lançamento: ");
                    int ano = userInputFilme.nextInt();

                    System.out.println("Ele é incluido no plano? [1] Sim [2] Não ");
                    int incluido = userInputFilme.nextInt();

                    System.out.println("Insira a duração em minutos:  ");
                    int duracao = userInputFilme.nextInt();

                    filme.setNomeDoFilme(nome);
                    filme.setAnoLancamento(ano);
                    filme.setIncluidoNoPlano(incluido == 1);
                    filme.setSinopse(sinopse);
                    filme.setDuracaoEmMinutos(duracao);

                    System.out.println(filme.serialize());

                    break;
                case 2:
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nExibindo informações do filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println("Nome do filme: " + filme.getNomeDoFilme());
                    System.out.println("Ano de lançamento: " + filme.getAnoLancamento());
                    System.out.println("Influido no plano: " + filme.getIncluidoNoPlano());
                    System.out.println("Nota do filme: " + filme.getNotaDoFilme());
                    System.out.println("Avaliação: " + filme.getAvaliacao());
                    System.out.println("Total de avaliações: " + filme.getQtdDeAvaliacoes());
                    System.out.println("Sinopse: " + filme.getSinopse());
                    System.out.println("Duração em minutos: " + filme.getDuracaoEmMinutos());
                    System.out.println("Média: " + filme.mediaNotas());
                    break;
                case 3:
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nAvaliando filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println("Insira a nota: ");
                    double nota = userInputFilme.nextDouble();
                    filme.avalia(nota);
                    break;
            }
        }
    }
}
