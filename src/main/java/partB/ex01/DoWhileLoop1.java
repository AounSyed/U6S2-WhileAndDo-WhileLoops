package partB.ex01;

public class DoWhileLoop1 {
    public static String doWhileLoopOne(){
        String response = "";
        int i = 0;
        int[] array = {43, 55, 68, 91, 105};
        do{
            System.out.println(array[i]);
            i++;
        } while (i <= array.length-1);



        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileOne = doWhileLoopOne();
        System.out.println(outputDoWhileOne);
    }
}
