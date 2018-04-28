package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaEstrangeiros {
    private static List<Estrangeiro> estrangeiro;
    public static List<Estrangeiro> getInstance() {
        if (estrangeiro == null) {
            estrangeiro = new ArrayList<>();
            estrangeiro.add(new Estrangeiro("Paolo","Peruano", 48, "paolo@hotmail.com"));
            estrangeiro.add(new Estrangeiro("Gustavo","Colômbiano", 50, "gustavo@yahoo.com"));
            estrangeiro.add(new Estrangeiro("Federico","Argentino", 1, "federico@gmail.com"));
        }
        return estrangeiro;
    }
}