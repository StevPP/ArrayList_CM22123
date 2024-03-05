package arraylist_cm22123;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio14 {
    
    public static void catorce(){
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        int indice1 = 0; // Índice del primer elemento (Pikachu)
        int indice2 = 4; // Índice del segundo elemento (Jigglypuff)

        Collections.swap(nombresPokemon, indice1, indice2);

        System.out.println("Lista despues del intercambio:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }
    }
}
