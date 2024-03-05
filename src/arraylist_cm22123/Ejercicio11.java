package arraylist_cm22123;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio11 {
    
    public static void once(){
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Invertir los elementos
        Collections.reverse(nombresPokemon);

        // Imprimir la lista invertida
        System.out.println("Lista despues de invertir los elementos:");
        for (String nombre : nombresPokemon) {
            System.out.println("\"" + nombre + "\"");
        }
    }
    
}
