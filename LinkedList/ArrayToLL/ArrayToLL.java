package LinkedList.ArrayToLL;



public class ArrayToLL {


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 8};
        Node head = LLUtilityMethod.insertArrayElementToLL(arr);
        Node newFirstNode = LLUtilityMethod.insertFirstNode(head, 9);
        Node newLastNode = LLUtilityMethod.insertLastNode(newFirstNode, 10);
        Node newKthNode = LLUtilityMethod.insertKthNode(newLastNode, 11, 2);
        LLUtilityMethod.displayLL(newKthNode);


      //  LLUtilityMethod.displayLL(newLastNode);
       // Node head1 = LLUtilityMethod.deleteLastNode(head);
//       Node kthResultOfHead =  LLUtilityMethod.deleteKthNode(head, 1);
//        LLUtilityMethod.displayLL(kthResultOfHead);
      //  LLUtilityMethod.searchElementInLL(head, 8);

    }


}
