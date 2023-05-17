
import java.util.ArrayList;
import java.util.Scanner;

public class CollectionSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();

        System.out.println("Enter names (enter 'done' to finish): ");

        String input = scanner.nextLine();

        while (!input.equals("done")) {
            names.add(input);
            input = scanner.nextLine();
        }

        System.out.println("Names entered: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

