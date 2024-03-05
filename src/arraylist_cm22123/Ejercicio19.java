package arraylist_cm22123;
import java.util.ArrayList;
public class Ejercicio19 {

    public static void diecinueve() {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        int nuevaCapacidad = 3;
        
        ArrayList<String> nuevoArrayList = new ArrayList<>(nombresPokemon.subList(0, nuevaCapacidad));

        System.out.println("Lista despues de reducir la capacidad:");
        for (String pokemon : nuevoArrayList) {
            System.out.println("\"" + pokemon + "\"");
        }
    }
}
