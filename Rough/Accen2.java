package Rough;

public class Accen2 {
    public static void main(String[] args) {
/*
        String str1= "move-hypen-to";
        char ch[]= str1.toCharArray();

        System.out.println(moveHyphen(ch));

       System.out.println(NumberOfcarries(451,349));
        System.out.println(replaceChar("apples",'a','p'));*/
//        System.out.println(operationChoice(4,12,6));
        System.out.println(calculate(100,160));
    }

    static  String moveHyphen(char str[]){

        String s="";
        String s1 ="";

        for (int i=0; i< str.length;i++){
            if(str[i]=='-'){
                s+=str[i];
            }else {
                s1+=str[i];
            }


        }
        return s+s1;
    }

    static int NumberOfcarries(int num1, int num2){
        int count =0;
        int temp1 = num1,temp2=num2;
        int r=0;
        while(temp1!=0 && temp2!=0){
            int d1 =temp1%10, d2=temp2%10;
            if((d1+d2+r) > 9){
                count++;
                int sum =d1+d2+r;
                sum =sum/10;
                r=sum;
            }
           temp1= temp1/10; temp2=temp2/10;
        }
        return count;
    }
     static String replaceChar(String str, char ch1, char ch2){
        if(str==null)
            return null;
        String s="";

        for (int i =0; i<str.length(); i++){
            if(str.charAt(i)==ch1){
                s+=ch2;
            }else  if(str.charAt(i)==ch2){
                s+=ch1;
            }else{
                s+=str.charAt(i);
            }
        }
        return s;
     }


     static int operationChoice(int c, int a, int b){
        switch( c) {
            case 1:
                c = a + b;
                break;
            case 2:
                c = a - b;
                break;
            case 3:
                c = a * b;
                break;
            case 4:
                c = a / b;
                break;

        }
        return c;
     }
     static int calculate(int m, int n){
        int sum =0;
        while (m>0 && m<=n){

            if(m % 3 ==0 && m % 5 ==0){
              sum =sum+m ;

            }
            m++;
        }
        return sum;
     }
}
