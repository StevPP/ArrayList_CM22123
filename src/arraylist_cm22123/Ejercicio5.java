package arraylist_cm22123;
import java.util.ArrayList;
public class Ejercicio5 {
    
    public static void cinco(){
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        String pokemonActualizar = "Charizard";
        String nuevoPokemon = "Dragonite";

       int indice = nombresPokemon.indexOf(pokemonActualizar);

        if (indice != -1) {
            nombresPokemon.set(indice, nuevoPokemon);
            System.out.println("Pokemon actualizado correctamente.");
        } else {
            System.out.println("El Pokemon no se encontro en la lista.");
        }

        System.out.println("Nombres de Pokemon actualizados:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }
    }
}
