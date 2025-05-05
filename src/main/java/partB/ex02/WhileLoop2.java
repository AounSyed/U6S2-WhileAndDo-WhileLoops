package partB.ex02;
import java.util.Scanner;
public class WhileLoop2 {
    public static String whileLoopTwo(){
        String response = "";
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Please enter a number to count to:");
        int stop = input.nextInt();
        do {
            System.out.println("The current number is: " + i);
            i++;
        } while(i < stop);
        System.out.println("We are done");


        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopTwo = whileLoopTwo();
        System.out.println(outputWhileLoopTwo);

    }
}
