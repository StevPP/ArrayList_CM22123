package arraylist_cm22123;

import java.util.ArrayList;

public class Ejercicio6 {
    public static void seis(){
     ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        int indiceTercerElemento = 2;

        nombresPokemon.remove(indiceTercerElemento);

        System.out.println("Lista despues de eliminar el tercer elemento:");
        for (String nombre : nombresPokemon) {
            System.out.println("\"" + nombre + "\"");
        }   
    }
}
