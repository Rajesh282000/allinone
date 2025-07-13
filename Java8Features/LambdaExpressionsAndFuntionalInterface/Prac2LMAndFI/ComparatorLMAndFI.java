package Java8Features.LambdaExpressionsAndFuntionalInterface.Prac2LMAndFI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorLMAndFI  {


        //Ascending order(a-b)
        //Descending order(b-a)
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

          //Collections.sort(list,(a, b)-> a-b);//Ascending order(a-b)
            Collections.sort(list,(a, b)-> b-a);//Descending order(b-a)
            System.out.println(list);
        }
}
