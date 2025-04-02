package br.uepa.jflix.utils;

import br.uepa.jflix.models.Usuario;

import static br.uepa.jflix.models.Colors.*;

public interface ClassificacaoIndicativa {
    default boolean podeAssistir(Usuario user, int classificacaoIndicativa, String nomeDoTitulo) {
        boolean pode = user.getIdade() > classificacaoIndicativa;

        String color;

        if (pode) {
            color = ANSI_GREEN;
        } else {
            color = ANSI_RED;
        }

        System.out.print(String.format(color + "O usuário %s", user.getNome()));
        if (!pode) System.out.print(" não");
        System.out.print(String.format(" pode assistir a serie \"%s\"", nomeDoTitulo));
        System.out.println(ANSI_RESET);

        return pode;
    }
}
