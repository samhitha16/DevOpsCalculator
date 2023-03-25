// package samhitha;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your function: \n"
                + "\t1. Square Root\n"
                + "\t2. Factorial\n"
                + "\t3. Natural Log\n"
                + "\t4. Exponent\n");
        Integer funcID = input.nextInt();
        Integer number1=0;
        Integer number2=0;
        System.out.println("Enter Input: ");
        number1 = input.nextInt();
        if(funcID == 4)
        {
            number2 = input.nextInt();
        }

        switch(funcID) {
            case 1: System.out.println(Calculator.squareRoot(number1));break;
            case 2: System.out.println(Calculator.factorial(number1));break;
            case 3: System.out.println(Calculator.naturalLogarithm(number1));break;
            case 4: System.out.println(Calculator.Exponent(number1, number2));break;
            
            default: System.out.println("Invalid input");break;
        }

        input.close();
    }

}
