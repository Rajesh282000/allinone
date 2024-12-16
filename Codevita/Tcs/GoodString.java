package Codevita.Tcs;
import java.util.ArrayList;
import java.util.Collections;

public class GoodString {
    public static void main(String[] args) {
        int ans = findGoodDifference("Nainika", "6*K4AQf]gpi");
        System.out.println("Jai Mata Di");
        System.out.println("Ans: " + ans);
        int ans1 = findGoodDifference("Vyom", "(@HR*i{kcQl");
        System.out.println("Ans 2: " + ans1);
    }

    static int findGoodDifference(String name, String gString) {
        int sum = 0;

        ArrayList<Integer> goodList = new ArrayList<>();
        for (char i : gString.toCharArray()) {
            goodList.add((int) i);
        }
        Collections.sort(goodList);

        ArrayList<Integer> nameList = new ArrayList<>();
        for (char i : name.toCharArray()) {
            nameList.add((int) i);
        }

        int present = (int) gString.charAt(0);
        ArrayList<Integer> cg = new ArrayList<>();

        for (int i = 0; i < nameList.size(); i++) {
            if (i!= 0) present = cg.get(cg.size()-1);
            int num = nameList.get(i);
            int index = Collections.binarySearch(goodList, num);

            // Found
            if (index>=0) {
                cg.add(num);

            } else {

                int ub = -(index+1);
                int lb = ub-1;
                if (ub == 0) {
                    cg.add(goodList.get(0));
                    sum+=Math.abs(nameList.get(i)-cg.get(cg.size()-1));
                }
                else if (lb == nameList.size()-1 ){
                    cg.add(goodList.get(lb));
                    sum+=Math.abs(nameList.get(i)-cg.get(cg.size()-1));
                }
                else{
                    int num1 = goodList.get(lb);
                    int num2 = goodList.get(ub);
                    int dif1 = Math.abs(num1 - num), dif2 = Math.abs(num2 - num);
                    if (dif1 < dif2) {
                        cg.add(num1);
                        sum += dif1;
                    } else if (dif2 < dif1) {
                        cg.add(num2);
                        sum += dif2;
                    } else {
                        int d1 = Math.abs(present - num1), d2 = Math.abs(present - num2);
                        if (d1 < d2) cg.add(num1);
                        else cg.add(num2);
                        nameList.set(i, present);
                        int pd = Math.abs(present - cg.get(cg.size() - 1));
                        sum += pd;
                    }
                }
            }

        }
        return sum;
    }
}
