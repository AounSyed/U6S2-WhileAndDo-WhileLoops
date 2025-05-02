package partA.ex01;

import java.util.Scanner;

public class SquareRootWhile {
    public static String squareRoot(){
        String response = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Type a non-negative integer: ");
        int number = input.nextInt();
        while (number < 0)
        {
            System.out.print("Invalid number, try again: ");
            number = input.nextInt();
        }
        System.out.println("The square root of " + number +  " is " + Math.sqrt(number));
        return response;
    }
    public static void main(String args[]) {
        String outputSquareRoot = squareRoot();
        System.out.println(outputSquareRoot);

    }
}
