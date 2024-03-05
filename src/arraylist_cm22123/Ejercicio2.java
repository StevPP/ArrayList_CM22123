package arraylist_cm22123;
import java.util.ArrayList;
public class Ejercicio2 {
    public static void segundo() {

        ArrayList<String> pokemon = new ArrayList<>();

        pokemon.add("Pikachu");
        pokemon.add("Charizard");
        pokemon.add("Bulbasaur");
        pokemon.add("Squirtle");
        pokemon.add("Jigglypuff");
        pokemon.add("Eevee");
        pokemon.add("Mewtwo");
        pokemon.add("Gyarados");
        pokemon.add("Snorlax");
        pokemon.add("Vulpix");
        
        for(String m: pokemon){
            System.out.print(m+" ,");
        }

        ArrayList<Integer>listaInt= new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            listaInt.add(i);
        }
        System.out.println("\n");
        for(Integer num: listaInt){
            System.out.print(num+",");
        }
        
        ArrayList<Character>caracter=new ArrayList();
        
        for(char c = 'A'; c <= 'J'; c++ ){
           caracter.add(c);
          
        }
        System.out.println("\n");
        for(Character mostrar : caracter){
            System.out.print(mostrar+" ,");
        }
    }

}
