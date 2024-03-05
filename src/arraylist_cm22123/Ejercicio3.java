package arraylist_cm22123;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void tres(){
        ArrayList<String> nombresDePokemons = new ArrayList<>();
        nombresDePokemons.add("Charizard");
        nombresDePokemons.add("Bulbasaur");
        nombresDePokemons.add("Squirtle");
        nombresDePokemons.add("Jigglypuff");

        String newPokemon = "Pikachu";

        nombresDePokemons.add(0, newPokemon);

        System.out.println("Lista despues de la insercion:");
        for (String p : nombresDePokemons) {
            System.out.println("\"" + p + "\"");
        }
    }
    
}
