package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaBuddys {
    private static List<Buddy> buddys;
    public static List<Buddy> getInstance() {
        if (buddys == null) {
            buddys = new ArrayList<>();
            buddys.add(new Buddy("José","TAE", 4, "jose@gmail.com"));
            buddys.add(new Buddy("Marcos","Aluno", 24, "marcos@hotmail.com"));
            buddys.add(new Buddy("Antônio","Doscente", 48 , "antonio@yahoo.com"));
        }
        return buddys;
    }
}
