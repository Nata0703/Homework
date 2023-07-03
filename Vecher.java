
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vecher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String userInput ="";

        while (!"q".equals(userInput)){
            try {

                System.out.println("Enter the first number!");
                userInput = scanner.next();
                if ("q".equals(userInput)) {
                    break;
                }
                int firstNumber = Integer.parseInt(userInput);
                System.out.println("Enter the second number!");
                userInput = scanner.next();
                if ("q".equals(userInput)) {
                    break;
                }
                int secondNumber = Integer.parseInt(userInput);
                System.out.println("Enter  operation!");
                userInput = scanner.next();
                if ("q".equals(userInput)) {
                    break;
                }
                double result;
                switch (userInput){
                    case "+":
                        result = plus(firstNumber, secondNumber);
                        break;
                    case "-":
                        result = minus(firstNumber, secondNumber);
                        break;
                    case "*":
                        result = ymn(firstNumber, secondNumber);
                        break;
                    case "/":
                        if(secondNumber == 0){
                            continue;
                        }
                        result = del(firstNumber, secondNumber);
                        break;
                    case "!":
                        result = fact(firstNumber);
                        break;
                    default:
                        result = 0;
                        break;

                }
                System.out.println(result);
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input data!");
                continue;
            }

        }
    }
    private static int plus(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private static int minus(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    private static int ymn(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    private static int del(int numberOne, int numberTwo){
        return numberOne / numberTwo;
    }
    private static int fact(int numberOne) {
        int res = 1;
        for (int i = 1; i < numberOne; i++) {
            res *= i;
        }
        return res;
    }
}
