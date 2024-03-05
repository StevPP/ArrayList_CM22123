package arraylist_cm22123;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio22 {
    
    public static void veintidos(){
        List<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");
        nombresPokemon.add("Eevee");
        nombresPokemon.add("Mewtwo");
        nombresPokemon.add("Gyarados");
        nombresPokemon.add("Snorlax");
        nombresPokemon.add("Vulpix");

        // Imprimir todos los elementos utilizando sus posiciones
        for (int i = 0; i < nombresPokemon.size(); i++) {
            System.out.println("#"+(i+1)+"-->"+nombresPokemon.get(i));
        }
    }
    
}
