import java.util.List;
import java.util.ArrayList;

public class EjercicioUno {
    public static void main(String[] args) {

        String fruta = "Apple";
        String fruta1 = "Banana";
        String fruta2 = "Cherry";

        List<String> listaFrutas = new ArrayList<>();

        listaFrutas.add(fruta);
        listaFrutas.add(fruta1);
        listaFrutas.add(fruta2);

        System.out.println(listaFrutas);
        System.out.println(listaFrutas.size());

        listaFrutas.remove(1);
        System.out.println(listaFrutas);

        listaFrutas.set(1, "Orange");
        System.out.println(listaFrutas);
    }
}
