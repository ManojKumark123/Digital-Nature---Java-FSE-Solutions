// Exercise 25 - HashMap Example
import java.util.HashMap;
import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            if (id == -1) break;
            System.out.print("Name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to search for name: ");
        int searchId = scanner.nextInt();
        System.out.println("Name: " + studentMap.getOrDefault(searchId, "ID not found"));
    }
}
