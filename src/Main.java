import br.uepa.jflix.models.Filme;
import br.uepa.jflix.models.Serie;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Filme> catalogoFilme = new ArrayList<Filme>();
        ArrayList<Serie> catalogoSerie = new ArrayList<Serie>();

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

                    Filme filme = new Filme();

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

                    filme.setNomeDoTitulo(nome);
                    filme.setAnoLancamento(ano);
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
                    filme = catalogoFilme.get(filmeEscolhido);

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nAvaliando filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println("Insira a nota: ");
                    double nota = userInputFilme.nextDouble();
                    filme.avalia(nota);

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nExibindo informações do filme\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println(filme.showInfo());
                    break;

                case 4:
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=\nCadastro de série\n=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    Serie serie = new Serie();
                case 5:
                case 6:
            }
        }
    }
}
