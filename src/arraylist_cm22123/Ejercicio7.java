package arraylist_cm22123;
import java.util.ArrayList;
public class Ejercicio7 {
    
    public static void siete(){
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        String elementoBuscar = "Squirtle";
        boolean encontrado = false;

        for (int i = 0; i < nombresPokemon.size(); i++) {
            if (nombresPokemon.get(i).equals(elementoBuscar)) {
                System.out.println("El Pokemon '" + elementoBuscar + "' se encuentra en la posicion #" + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El Pokemon '" + elementoBuscar + "' no esta en la lista.");
        }
    }
}
