package arraylist_cm22123;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio15 {
    public static void quince(){
        List<String> primerConjunto = new ArrayList<>();
        primerConjunto.add("Pikachu");
        primerConjunto.add("Charizard");
        primerConjunto.add("Bulbasaur");

        List<String> segundoConjunto = new ArrayList<>();
        segundoConjunto.add("Squirtle");
        segundoConjunto.add("Jigglypuff");

        List<String> listaResultante = new ArrayList<>();
        listaResultante.addAll(primerConjunto);
        listaResultante.addAll(segundoConjunto);

        System.out.println("Lista resultante: ");
        for (String pokemon : listaResultante) {
            System.out.println(pokemon);
        }
    }
}
