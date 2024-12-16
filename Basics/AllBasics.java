package Basics;

public class AllBasics {


    public static void main(String[] args) {
/*
        leapYear(2000);

     int l=2 , h=100;
      for( int i =l; i<=h; i++) {
          if(primeNo(i))
              System.out.print( i + "\t");
      }
      num("1225");*/
        int i  =123;
        reverseNo(i);
        armsNo(i);

        System.out.println(primeNo(56));


    }



    //1.Leap Year
    static void leapYear(int n){


        if(n % 4==0 && n % 100 !=0 || n % 400==0){
            System.out.println("It is Leap year");
        }else
            System.out.println("Not LY");
    }

    //2.Prime number
  static boolean primeNo(int n )
  {
      if(n<2)
          return false;

      for(int i=2; i< Math.sqrt(n);i++ ){
          if(n % i ==0)
              return false;
      }
      return true;
  }
//3.convert string to int
  static void num(String str){
        int n = Integer.valueOf(str);
      System.out.println(n);
  }

  //4. reverse no.
    static void reverseNo(int n){
        int reverse =0;

        int r;

        while (n!=0) {
             r = n % 10;
            reverse = reverse * 10 + r;
            n/=10;
        }

        System.out.println(reverse);

    }

    //5.Armstrong no.
    static void armsNo(int n){
        int temp=n, r=0;
        int digits=0,sum=0 ;

        while (temp > 0) {
            temp/=10;
            digits++;

        }
        temp=n;
        while (temp > 0 ){
            r=temp%10;
            sum+=Math.pow(r,digits);
            temp/=10;

        }
        if(n==sum)
            System.out.println("Armstrong");
        else
            System.out.println("No Armstrong");
    }


}
