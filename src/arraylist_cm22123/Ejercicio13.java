package arraylist_cm22123;
import java.util.HashSet;
import java.util.Set;
public class Ejercicio13 {
    
    public static void trece(){
        Set<String> primerConjunto = new HashSet<>();
        primerConjunto.add("Pikachu");
        primerConjunto.add("Charizard");
        primerConjunto.add("Bulbasaur");

        Set<String> segundoConjunto = new HashSet<>();
        segundoConjunto.add("Bulbasaur");
        segundoConjunto.add("Squirtle");
        segundoConjunto.add("Jigglypuff");

        boolean sonIguales = primerConjunto.equals(segundoConjunto);

        if (sonIguales) {
            System.out.println("Los conjuntos de Pokemon son iguales.");
        } else {
            System.out.println("Los conjuntos de Pokemon no son iguales.");
        }
    }
    
}
