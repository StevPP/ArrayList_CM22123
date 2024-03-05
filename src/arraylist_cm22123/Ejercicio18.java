package arraylist_cm22123;

import java.util.ArrayList;

public class Ejercicio18 {
    public static void dieciocho(){
        ArrayList<String> nombresPokemon = new ArrayList<>();
      
        if (nombresPokemon.isEmpty()) {
            System.out.println("El ArrayList esta vacio.");
        } else {
            System.out.println("El ArrayList no esta vacio.");
        }
        
        nombresPokemon.add("Pikachu");
      
        if (nombresPokemon.isEmpty()) {
            System.out.println("El ArrayList esta vacio.");
        } else {
            System.out.println("El ArrayList no esta vacio.");
        }
    }
            
}
