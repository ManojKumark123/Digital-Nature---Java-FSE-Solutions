// Exercise 27 - Lambda Expressions
import java.util.ArrayList;
import java.util.Collections;

public class Exercise_27 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println("Sorted list:");
        list.forEach(System.out::println);
    }
}
