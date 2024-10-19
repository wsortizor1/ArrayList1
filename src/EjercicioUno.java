import java.util.List;
import java.util.ArrayList;

public class EjercicioUno {
    public static void main(String[] args) {

        String fruta = "Apple";
        String fruta1 = "Banana";
        String fruta2 = "Cherry";

        List<String> fruits = new ArrayList<>();

        fruits.add(fruta);
        fruits.add(fruta1);
        fruits.add(fruta2);

        System.out.println(fruits);
        System.out.println(fruits.size());

        fruits.remove(1);
        System.out.println(fruits);

        fruits.set(1, "Orange");
        System.out.println(fruits);
    }
}
