package Java8Features.LambdaExpressionsAndFuntionalInterface.Prac2LMAndFI;

public class RunnableThreadLMAndFI{
    public static void main(String[] args) {
       Runnable runnable = () -> {
           for (int i = 0; i < 10; i++) {
               System.out.println("Thread is running " + i);
           }
       };
         Thread thread = new Thread(runnable);
         thread.run();

    }
}