package LinkedList.ArrayToLL;



public class ArrayToLL {


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 8};
        Node head = LLUtilityMethod.insertArrayElementToLL(arr);
        LLUtilityMethod.displayLL(head);
        Node head1 = LLUtilityMethod.deleteLastNode(head);
        LLUtilityMethod.displayLL(head1);
      //  LLUtilityMethod.searchElementInLL(head, 8);

    }


}
