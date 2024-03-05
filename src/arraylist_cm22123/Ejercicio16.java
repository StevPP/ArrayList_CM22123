package arraylist_cm22123;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio16 {
    
    public static void dieciseis(){
       List<String> primerConjunto = new ArrayList<>();
        primerConjunto.add("Pikachu");
        primerConjunto.add("Charizard");
        primerConjunto.add("Bulbasaur");

        List<String> conjuntoClonado = new ArrayList<>(primerConjunto);

        for (String pokemon : conjuntoClonado) {
            System.out.println(pokemon);
        } 
    }
}
