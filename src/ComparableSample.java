import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSample
{
    public static void main(String[] args) {


        List<Employee> listEmployees = new ArrayList<>();
        Employee e1 = new Employee("Muthu", "Vasanth");
        Employee e2 = new Employee("Dinesh", "Kumar");
        Employee e3 = new Employee("Aathersh", "Achu");
        Employee e4 = new Employee("Bill", "Gates");
        Employee e5 = new Employee("Arya", "Vimal");

        listEmployees.add(e1);
        listEmployees.add(e2);
        listEmployees.add(e3);
        listEmployees.add(e4);
        listEmployees.add(e5);
        Collections.sort(listEmployees);
        System.out.println(listEmployees);

    }
}
