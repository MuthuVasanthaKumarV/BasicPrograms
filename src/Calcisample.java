import java.util.Scanner;

public class Calcisample
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         boolean a=true;
      while (a){
          System.out.println("******Welcome to Calculator App******");
        System.out.println("1.Using operation with Two Numbers \t 2.Using operation with Three Numbers \t 3.Exit");
        System.out.print("Enter the option : ");
        int values = sc.nextInt();

        switch (values) {
            case 1:
                System.out.print("Enter the number1 :");
                double number1 = sc.nextDouble();
                System.out.print("Enter the operation( +,-,%,/) : ");
                String operation1 = sc.next();
                System.out.print("Enter the number2 : ");
                double number2 = sc.nextDouble();
                Calculator c = new Calculator( number1, operation1 ,number2);
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " = " + c.getRes());

            break;
            case 2:
                System.out.print("Enter the number1 :");
                double number3 = sc.nextDouble();
                System.out.print("Enter the operation ( +,-,%,/) : ");
                String operation2 = sc.next();
                System.out.print("Enter the number2 : ");
                double number4 = sc.nextDouble();
                System.out.print("Enter the operation ( +,-,%,/) : ");
                String operation3 = sc.next();
                System.out.print("Enter the number3 : ");
                double number5 = sc.nextDouble();
                Calculator c1 = new Calculator(number3,operation2,number4,operation3,number5);
                System.out.println("Yours Output = " + number3 + " " + operation2 + " " + number4 + " " + operation3 + " " + number5 + " = " + c1.getRes());
            break;
        }
            if(values==3)
            {
                System.out.println("******Thanks for Using This Application******");
                break;
            }
        }
    }}

