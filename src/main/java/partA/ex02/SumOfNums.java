package partA.ex02;

import java.util.Scanner;

public class SumOfNums {
    public static String sum(){
        String response ="";
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.print("Enter a number (Enter 0 to quit): ");
            number = input.nextInt();
            if(number != 0)
            {
                sum = sum + number;
            }
        } while (number != 0);
        System.out.println("The sum is " + sum);
        return response;
    }
    public static void main(String args[]) {
        String outputSum = sum();
        System.out.println(outputSum);
    }
}
