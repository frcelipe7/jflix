import br.uepa.jflix.models.Filme;
import br.uepa.jflix.models.Serie;
import br.uepa.jflix.models.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

//api_endpoint = "http://www.omdbapi.com/?i=tt3896198&apikey=11c74a87"

public class Main {
    public static void main(String[] args) {
        ArrayList<Filme> catalogoFilme = new ArrayList<Filme>();
        ArrayList<Serie> catalogoSerie = new ArrayList<Serie>();

        // Instância de um filme
        Filme meuFilme = new Filme("Gladiador", 2000, 12);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(240);
        meuFilme.setSinopse("""
                O general que virou escravo...
                O escravo que virou Gladiador...
                Gladiador que desafiou o império.""");
        meuFilme.avalia(3.2);
        meuFilme.avalia(10);
        meuFilme.avalia(6);

        // Adicionando no catalogo
        catalogoFilme.add(meuFilme);

        // Instância de uma série
        Serie serie1 = new Serie("Breaking Bad", 2014, 18);
        serie1.setTemporadas(6);
        serie1.setMinutosPorEpisodio(40);
        serie1.setEpisodiosPorTemporada(12);

        // Adicionando no catalogo
        catalogoSerie.add(serie1);

        // Criando um usuário
        LocalDate dataNascimento = LocalDate.of(2015, 2, 5);

        Usuario user = new Usuario("Felipe", dataNascimento);
        System.out.println(user.getIdade());

        // Dizendo quais filmes do catálogo o usuário pode assistir
        for (Filme filme : catalogoFilme) {
            boolean podeAssistir = filme.verificarPodeAssistir(user);
        }

        // Dizendo quais séries do catálogo o usuário pode assistir
        for (Serie serie : catalogoSerie) {
            boolean podeAssistir = serie.verificarPodeAssistir(user);
        }

        // op é a variavel que define a operacao que o user vai realizar
        int op = 0;
        Scanner userOp = new Scanner(System.in);
        Scanner userInputFilme = new Scanner(System.in);

        while (op != 7) {
            System.out.println("\n--------------------------");
            System.out.println("O que você deseja fazer?");
            System.out.println(" [1] - Cadastrar filme;");
            System.out.println(" [2] - Exibir informações do filme;");
            System.out.println(" [3] - Avaliar filme;");

            System.out.println(" [4] - Cadastrar série;");
            System.out.println(" [5] - Exibir informações da série;");
            System.out.println(" [6] - Avaliar série;");

            System.out.println(" [7] - Sair;");

            op = userOp.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nCadastro de filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");


                    System.out.println("Insira o nome do filme: ");
                    String nome = userInputFilme.nextLine();

                    System.out.println("Insira a sinopse do filme: ");
                    String sinopse = userInputFilme.nextLine();

                    System.out.println("Insira a classificacao indicativa:  ");
                    int classificacaoIndicativa = userInputFilme.nextInt();

                    System.out.println("Insira o ano de lançamento: ");
                    int ano = userInputFilme.nextInt();

                    System.out.println("Ele é incluido no plano? [1] Sim [2] Não ");
                    int incluido = userInputFilme.nextInt();

                    System.out.println("Insira a duração em minutos:  ");
                    int duracao = userInputFilme.nextInt();

                    Filme filme = new Filme(nome, ano, classificacaoIndicativa);
                    filme.setIncluidoNoPlano(incluido == 1);
                    filme.setSinopse(sinopse);
                    filme.setDuracaoEmMinutos(duracao);

                    catalogoFilme.add(filme);

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nExibindo informações do filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");

                    System.out.println(filme.showInfo());

                    break;
                case 2:
                    System.out.println("Você deseja ver os detalhes de qual filme?");
                    for (Filme iFilme : catalogoFilme) {
                        System.out.println(String.format("[%d] - %s", catalogoFilme.indexOf(iFilme), iFilme.getNomeDoTitulo()));
                    }

                    int escolhaFilme = userInputFilme.nextInt();

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nExibindo informações do filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println(catalogoFilme.get(escolhaFilme).showInfo());

                    break;
                case 3:
                    System.out.println("Você deseja avaliar qual filme?");
                    for (Filme iFilme : catalogoFilme) {
                        System.out.println(String.format("[%d] - %s", catalogoFilme.indexOf(iFilme), iFilme.getNomeDoTitulo()));
                    }

                    int filmeEscolhido = userInputFilme.nextInt();
                    Filme filmeAvaliar = catalogoFilme.get(filmeEscolhido);

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nAvaliando filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println("Insira a nota: ");
                    double nota = userInputFilme.nextDouble();
                    filmeAvaliar.avalia(nota);

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nExibindo informações do filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println(filmeAvaliar.showInfo());
                    break;

                case 4:
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nCadastro de série\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println("Insira o nome do filme: ");
                    String nomeSerie = userInputFilme.nextLine();

                    System.out.println("Insira o ano de lançamento: ");
                    int anoSerie = userInputFilme.nextInt();

                    System.out.println("Insira a classificacao indicativa:  ");
                    int classificacaoIndicativaSerie = userInputFilme.nextInt();

                    Serie serie = new Serie(nomeSerie, anoSerie, classificacaoIndicativaSerie);

                case 5:
                    System.out.println("Você deseja ver os detalhes de qual serie?");
                    for (Serie iSerie : catalogoSerie) {
                        System.out.println(String.format("[%d] - %s", catalogoSerie.indexOf(iSerie), iSerie.getNomeDoTitulo()));
                    }

                    int escolhaSerie = userInputFilme.nextInt();

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nExibindo informações da serie\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println(catalogoFilme.get(escolhaSerie).showInfo());

                    break;
                case 6:
            }
        }
    }
}
