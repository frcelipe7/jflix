package br.uepa.jflix.utils;
import br.uepa.jflix.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui (Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }
}