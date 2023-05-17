import java.util.Scanner;

public class Calculator {

    double number1;
    double number2;
    double number3;
    String operation1;
    String operation2;
    private static double res=0;

    public double getRes() {

        return res;
    }

        Calculator(double number1,String operation1,double number2)
    {
        performOperation( number1, operation1, number2);
        this.number1 = number1;
        this.number2 = number2;
        this.operation1 = operation1;
    }
      void performOperation(double number1,String operation1,double number2)
        {
        switch (operation1) {
            case "+": {
                res = number1 + number2;
                break;
            }
            case "-": {
                res = number1 - number2;
                break;
            }
            case "*": {
                res = number1 * number2;
                break;
            }
            case "/": {
                if (number2 == 0) {
                    System.out.println("Infinity");
                } else
                    res = number1 / number2;
                break;
            }
            case "%": {
                res = number1 % number2;
                break;
            }
            default: {
                System.out.println("Your entered invalid operation");
            }
        }
    }
    Calculator(double number1,String operation1,double number2,String operation2,double number3)
    {
        performOperation(number1, operation1, number2, operation2, number3);
        this.number1 = number1;
        this.number2 = number2;
        this.operation1 = operation1;
        this.number3 = number3;
        this.operation2 = operation2;
    }
    void performOperation(double number1,String operation1,double number2,String operation2,double number3)
    {

        switch (operation1+operation2) {
            case "+-": {
                res = number1 + number2 - number3;
                break;
            }
            case "++": {
                res = number1 + number2 + number3;
                break;
            }
            case "+*": {
                res = number1 + number2 * number3;
                break;
            }
            case "+%": {
                res = number1 + number2 % number3;
                break;
            }
            case "+/": {
                if(number3==0)
                {
                    System.out.println("We can't divided by 0");
                    break;
                }
                else
                res = number1 + number2 / number3;
                break;
            }
            case "--": {
                res = number1 - number2 - number3;
                break;
            }
            case "-+": {
                res = number1 - number2 + number3;
                break;
            }
            case "-*": {
                res = number1 - number2 * number3;
                break;
            }
            case "-/": {
                res = number1 - number2 / number3;
                break;
            }
            case "-%": {
                res = number1 - number2 % number3;
                break;
            }
            case "*+": {
                res = number1 * number2 + number3;
                break;
            }
            case "*-": {
                res = number1 * number2 - number3;
                break;
            }
            case "**": {
                res = number1 * number2 * number3;
                break;
            }
            case "*%": {
                res = number1 * number2 % number3;
                break;
            }
            case "*/": {
                res = number1 * number2 / number3;
                break;
            }

           case "/+": {
                res = number1 / number2 + number3;
                break;
            }
            case "/-": {
                res = number1 / number2 - number3;
                break;
            }
            case "/*": {
                res = number1 / number2 * number3;
                break;
            }
            case "//": {
                res = number1 / number2 / number3;
                break;
            }
            case "/%": {
                res = number1 / number2 % number3;
                break;
            }
            case "%+": {
                res = number1 % number2 + number3;
                break;
            }
            case "%-": {
                res = number1 % number2 - number3;
                break;
            }
            case "%*": {
                res = number1 % number2 * number3;
                break;
            }
            case "%/": {
                res = number1 % number2 / number3;
                break;
            }
            case "%%": {
                res = number1 % number2 % number3;
                break;
            }
            default: {
                System.out.println("Your entered invalid operation");
            }
        }
    }

}
