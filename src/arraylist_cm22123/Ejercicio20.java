package arraylist_cm22123;
import java.util.ArrayList;
public class Ejercicio20 {
    public static void veinte(){
ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");

        int nuevoTamañoDeseado = 5;

        while (nombresPokemon.size() < nuevoTamañoDeseado) {
            nombresPokemon.add(null); 
        }

        System.out.println("Lista despues de aumentar el tamano:");
        for (String pokemon : nombresPokemon) {
            System.out.println(pokemon);
        }
    }
}
