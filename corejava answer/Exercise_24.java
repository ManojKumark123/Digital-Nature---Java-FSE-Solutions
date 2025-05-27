// Exercise 24 - ArrayList Example
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_24 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names (type 'exit' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            students.add(name);
        }

        System.out.println("Student names entered:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
