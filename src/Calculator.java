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
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " = " + getRes());
                break;
            }
            case "-": {
                res = number1 - number2;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " = " + getRes());
                break;
            }
            case "*": {
                res = number1 * number2;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " = " + getRes());
                break;
            }
            case "/": {

                try {
                    res = number1 / number2;

                }
                catch(ArithmeticException e)
                    {
                        System.out.println("WE CAN'T DIVIDED BY 0");
                        System.out.println(e);

                    }
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " = " + getRes());
                break;
            }
            case "%": {
                res = (number1*100)/number2;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " = " + getRes());
                break;
            }
            case "^":
            {
                res = Math.pow((int)number1,(int)number2);
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " = " + getRes());
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
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "++": {
                res = number1 + number2 + number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "+*": {
                res = number1 + number2 * number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "+%": {
                res = number1 + (number2*100) / number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "+/": {
                if(number3==0)
                {
                    System.out.println("WE CAN'T DIVIDED BY 0");
                    break;
                }
                else
                res = number1 + number2 / number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "+^":
            {
                res=number1+Math.pow(number2,number3);
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "--": {
                res = number1 - number2 - number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "-+": {
                res = number1 - number2 + number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "-*": {
                res = number1 - number2 * number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "-/": {
                if(number3==0)
                {
                    System.out.println("WE CAN'T DIVIDED BY 0");
                    break;
                }
                else
                res = number1 - number2 / number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "-%": {
                res = number1 - (number2*100) / number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "-^":
            {
                res = number1 -Math.pow(number2,number3);
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "*+": {
                res = number1 * number2 + number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "*-": {
                res = number1 * number2 - number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "**": {
                res = number1 * number2 * number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "*%": {
                res = number1 * (number2*100) / number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "*/": {
                if(number3==0)
                {
                    System.out.println("WE CAN'T DIVIDED BY 0");

                    break;
                }
                else
                res = number1 * number2 / number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "*^":
            {
                res = number1* Math.pow(number2,number3);
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
           case "/+": {
               if(number2==0)
               {
                   System.out.println("WE CAN'T DIVIDED BY 0");
                   break;
               }
               else
                res = number1 / number2 + number3;
               System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

               break;
            }
            case "/-": {
                if(number2==0) {
                    System.out.println("WE CAN'T DIVIDED BY 0");
                }
                else
                    res = number1 / number2 - number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "/*": {
                if(number2==0) {
                    System.out.println("WE CAN'T DIVIDED BY 0");
                }
                else
                    res = number1 / number2 * number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "//": {
                if(number2==0 || number3==0) {
                    System.out.println("WE CAN'T DIVIDED BY 0");
               break;
                }
                else
                res = number1 / number2 / number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());
                break;
            }
            case "/%": {
                if(number2==0) {
                    System.out.println("WE CAN'T DIVIDED BY 0");
                    break;
                }
                else
                res = number1 / (number2*100) / number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "/^": {

                res = number1 / Math.pow(number2, number3);
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());
                break;
            }
            case "%+": {
                res = (number1*100) /number2 + number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "%-": {
                res = (number1*100) /number2 - number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "%*": {
                res = (number1*100) /number2 * number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "%/": {
                if(number3==0) {
                    System.out.println("We can't divided by 0");
                }
                else
                res = (number1*100) /number2 / number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "%%": {
                res = (number1*100) /(number2*100)/(number3 *100);
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "%^": {
                res = (number1 * 100) / Math.pow(number2, number3);
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            }
            case "^+":
                res = Math.pow(number1,number2)+number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            case "^-":
                res= Math.pow(number1,number2)-number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            case "^*":
                res= Math.pow(number1,number2)*number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            case "^%":
                res =Math.pow(number1,number2) *100/number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            case "^/":
                if(number3==0) {
                    System.out.println("We can't divided by 0");
                }
                res= Math.pow(number1,number2)/number3;
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            case "^^":
                double temp ;
                temp= Math.pow(number1,number2);
                res = Math.pow(temp,number3);
                System.out.println("Yours Output = " + number1 + " " + operation1 + " " + number2 + " " + operation2 + " " + number3 + " = " + getRes());

                break;
            default: {
                System.out.println("Your entered invalid operation");
            }
        }
    }

}
