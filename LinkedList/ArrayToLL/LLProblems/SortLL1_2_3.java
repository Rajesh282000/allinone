package LinkedList.ArrayToLL.LLProblems;
import LinkedList.ArrayToLL.Node;

public class SortLL1_2_3 {
    public static Node sortOneTwoThreeInLL(Node head){
        Node temp = head;
        Node zeroHead = new Node(-1);
        Node zero = zeroHead;
        Node oneHead = new Node(-1);
        Node one = oneHead;
        Node twoHead = new Node(-1);
        Node two = twoHead;

        while(temp != null){
            if(temp.val== 0){
                zero.next = temp;
                zero = temp;
            }else if(temp.val== 1){
                one.next = temp;
                one = temp;

            } else if(temp.val== 2){
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        two.next = null;

        zero.next = oneHead.next;
        one.next = twoHead.next;


        return zeroHead.next;
    }
}
