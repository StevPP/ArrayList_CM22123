package arraylist_cm22123;
import java.util.ArrayList;
public class Ejercicio21 {
    public static void veintiuno() {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        String nuevoPokemon = "Venusaur";
        int indiceAReemplazar = 1;
        nombresPokemon.set(indiceAReemplazar, nuevoPokemon);

        System.out.println("Lista despues de reemplazar el segundo elemento:");
        for (String pokemon : nombresPokemon) {
            System.out.println("\"" + pokemon + "\"");
        }
    }

}
