package arraylist_cm22123;
import java.util.ArrayList;
public class Ejercicio4 {
    public static void cuatro() {
        ArrayList<String> nombresPokemons = new ArrayList<>();
        nombresPokemons.add("Pikachu");
        nombresPokemons.add("Charizard");
        nombresPokemons.add("Bulbasaur");
        nombresPokemons.add("Squirtle");
        nombresPokemons.add("Jigglypuff");
        nombresPokemons.add("Eevee");
        nombresPokemons.add("Mewtwo");
        nombresPokemons.add("Gyarados");
        nombresPokemons.add("Snorlax");
        nombresPokemons.add("Vulpix");

        int indice = 2;

        String pokemon = nombresPokemons.get(indice);

        System.out.println("Pokemon en el indice " + indice + ": " + pokemon);
    }

}
