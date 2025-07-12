package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PraticeIterator1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Iterator<Integer> itr = arrayList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("------------------");


        ListIterator<Integer> listItr = arrayList.listIterator();
        while(listItr.hasNext()) {
            System.out.println("Previous Index: "+listItr.previousIndex());
            System.out.println("Next Index: "+listItr.next());
            System.out.println("Next Index: "+listItr.nextIndex());
        }
    }
}
