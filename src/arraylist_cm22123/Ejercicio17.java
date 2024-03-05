package arraylist_cm22123;
import java.util.ArrayList;
public class Ejercicio17 {

    public static void diecisiete() {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        nombresPokemon.clear();

        if (nombresPokemon.isEmpty()) {
            System.out.println("El ArrayList de nombres de Pokemon esta vacio.");
        } 
    }
}
