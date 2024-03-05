package arraylist_cm22123;

import java.util.ArrayList;

public class Ejercicio1 {
        public static void uno(){
        ArrayList<String> Pokemons =new ArrayList<>();
        
        Pokemons.add("Pikachu");
        Pokemons.add("Charizard");
        Pokemons.add("Bulbasaur");
        Pokemons.add("Squirtle");
        Pokemons.add("Jigglypuff");
        
          System.out.println("Los nombres de los Pokemons son los siguientes:");
        for(String n : Pokemons){
            System.out.println(n);
        }
        
    }
    
}

