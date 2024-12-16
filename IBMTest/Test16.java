package IBMTest;

public class Test16 {
    public static void main(String[] args) {
        hcf(70,15);
    }
    static void hcf(int n1, int n2){
        for(int i=2; i<n1|| i<n2 ; i++ ){
            if(n1%i==0 && n2%i==0)
                System.out.println(i);
        }
    }

}
