package Java8Features.LambdaExpressionsAndFuntionalInterface.Prac2LMAndFI;

public class Main {

    public static void main(String[] args) {
        Employee employee = ()-> "Software Engineer";
        System.out.println(employee.getName());
    }
}
