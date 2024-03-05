package arraylist_cm22123;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio12 {
    
    public static void doce(){
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        int indiceInicio = 1;
        int indiceFin = 4;

        List<String> porcionExtraida = nombresPokemon.subList(indiceInicio, indiceFin);

        System.out.println("Porcion extraida:");
        for (String nombre : porcionExtraida) {
            System.out.println(nombre);
        }
    }
}
