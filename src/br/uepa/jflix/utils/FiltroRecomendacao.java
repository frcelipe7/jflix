package br.uepa.jflix.utils;

import javax.sound.midi.SysexMessage;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos da galrea");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista para asssitir depois");
        }
    }
}
