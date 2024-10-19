import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("for");
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println("foreach:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("While:");
        int index = numbers.size() - 1;
        while (index >= 0) {
            System.out.println(numbers.get(index));
            index--; // Decrementar el índice
        }
    }
}