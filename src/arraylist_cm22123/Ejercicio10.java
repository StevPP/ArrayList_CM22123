package arraylist_cm22123;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio10 {
        public static void diez (){
            
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        Collections.shuffle(nombresPokemon);

        System.out.println("Lista despues de mezclar:");
        for (String nombre : nombresPokemon) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}
