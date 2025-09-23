package LinkedList.ArrayToDLL;

public class ArrToDLL {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Node head = DLLUtilityMethod.ArrayToDLL(arr);
        DLLUtilityMethod.displayDLL(head);
//        Node delHead = DLLUtilityMethod.deletionHead(head);
//        DLLUtilityMethod.displayDLL(delHead);
//        Node delLastNode = DLLUtilityMethod.deletionLastNode(delHead);
       // DLLUtilityMethod.displayDLL(delLastNode);
//        Node deleteKthNode = DLLUtilityMethod.deletionKthNode(head, 2);
//        DLLUtilityMethod.displayDLL(deleteKthNode);

//        Node insertHead = DLLUtilityMethod.insertHead(head, 8);
//        Node insertLastNode = DLLUtilityMethod.insertLastNode(head, 9);
        Node insertKthPosition = DLLUtilityMethod.insertKthNode(head, 89, 2);
        DLLUtilityMethod.displayDLL(insertKthPosition);
    }
}
