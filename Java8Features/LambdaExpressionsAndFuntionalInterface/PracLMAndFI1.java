package Java8Features.LambdaExpressionsAndFuntionalInterface;

import java.util.function.Consumer;

public class PracLMAndFI1 {
    public static void main(String[] args) {

        //Consumer<String> stringConsumer = (String s) -> System.out.println(s);

        //type inference: compiler guess the type
        //Consumer is a Funtional Interface
        Consumer<String> stringConsumer = ( s) -> System.out.println(s);
        stringConsumer.accept("Hello from Lambda!");
        //System.out.println(stringConsumer);
    }



}


