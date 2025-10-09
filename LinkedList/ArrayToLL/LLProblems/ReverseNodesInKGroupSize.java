 package LinkedList.ArrayToLL.LLProblems;

 import LinkedList.ArrayToLL.LLUtilityMethod;
 import LinkedList.ArrayToLL.Node;

 public class ReverseNodesInKGroupSize {
     public static Node getKthNode(Node temp, int k){
         k-=1;
         while(temp != null && k > 0){
             k--;
             temp = temp.next;
         }
         return temp;
     }

     public static Node kReverse(Node head, int k){
         Node temp = head, next= null, prev = null;
         while(temp!=null){
             Node kthNode = getKthNode(temp, k);
             if(kthNode == null){
                 if(prev!=null){
                     prev.next = temp;
                 }
                 break;
             }

              next = kthNode.next;
              kthNode.next =null;
             ReverseLL.reverseLL(temp);
             if(temp == head) {
                 head = kthNode;

             }else{
                 prev.next = kthNode;
             }
             prev = temp;
             temp = next;


         }
         return head;

     }
 }
