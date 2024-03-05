package arraylist_cm22123;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio8 {
    public static void ocho (){
        
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        Collections.sort(nombresPokemon);

        System.out.println("Lista despues de ordenar alfabeticamente:");
        for (String nombre : nombresPokemon) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}
