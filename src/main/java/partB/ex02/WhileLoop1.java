package partB.ex02;

public class WhileLoop1 {
    public static String whileLoopOne(){
        String response = "";
        int i=2;
        do {
            if(i%2==0)
                System.out.println(i + " is even");
            i++;
        }while(i<1001);

        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopOne = whileLoopOne();
        System.out.println(outputWhileLoopOne);
    }
}
