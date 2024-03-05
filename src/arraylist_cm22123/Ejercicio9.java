package arraylist_cm22123;
import java.util.ArrayList;
public class Ejercicio9 {
    public static void nueve(){
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        ArrayList<String> copiaProfundaNombresPokemon = new ArrayList<>();
        for (String nombre : nombresPokemon) {
            copiaProfundaNombresPokemon.add(nombre);
        }

        System.out.println("Copia profunda de nombres de Pokemon:");
        for (String nombre : copiaProfundaNombresPokemon) {
            System.out.println(nombre);
        }
    }
    
    }
