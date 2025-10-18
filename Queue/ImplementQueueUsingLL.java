package Queue;
import LinkedList.ArrayToLL.Node;
public class ImplementQueueUsingLL {
    static Node start, end;
    static int size =0;
    public static void pop(int val){
        Node temp = new Node(val);
        if(start == null){
            start =end =temp;
        }else{
            end.next = temp;
        }
        size+=1;
    }

    public static void pop(){
        if(start == null)
            return;

        Node temp = start;
        start = start.next;
        temp.next = null;
        size-=1;
    }
    public static void top(){
        if(start == null)
            return;

        System.out.println("Top element is: "+ start.val);
    }
}
