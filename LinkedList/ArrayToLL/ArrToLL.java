package LinkedList.ArrayToLL;


import LinkedList.ArrayToLL.LLProblems.*;

import java.util.List;

public class ArrToLL {


    public static void main(String[] args) {
        int[] arr1 = {2, 4, 2, 9};
        int[] arr2 = {8, 8, 8};
        Node head1 = LLUtilityMethod.insertArrayElementToLL(arr1);
        Node head2 = LLUtilityMethod.insertArrayElementToLL(arr2);


//        Node newFirstNode = LLUtilityMethod.insertFirstNode(head, 9);
//        Node newLastNode = LLUtilityMethod.insertLastNode(newFirstNode, 10);
//        Node newKthNode = LLUtilityMethod.insertKthNode(newLastNode, 11, 2);
//        LLUtilityMethod.displayLL(newKthNode);


        //  LLUtilityMethod.displayLL(newLastNode);
        // Node head1 = LLUtilityMethod.deleteLastNode(head);
//       Node kthResultOfHead =  LLUtilityMethod.deleteKthNode(head, 1);
//        LLUtilityMethod.displayLL(kthResultOfHead);
        //  LLUtilityMethod.searchElementInLL(head, 8);

        //Problems Method running
        //1.
//        Node result1 =AddingTwoNumberFromTwoLL.addingTwoNumberFromLL(head1, head2);
//        LLUtilityMethod.displayLL(result1);

        //2.
//        int[] problem2Arr = {10, 1, 3, 4, 2, 5, 6, 7};
//        Node problem2Head = LLUtilityMethod.insertArrayElementToLL(problem2Arr);
//        List<Node> listNode = OddEvenLinkedList.oddEvenLL(problem2Head);
//
//        for(Node head : listNode){
//            LLUtilityMethod.displayLL(head);
//        }

        //3.
//        int[] problem3Arr = {1, 0, 1, 2, 0, 2, 1};
//        Node problem3Head = LLUtilityMethod.insertArrayElementToLL(problem3Arr);
//        Node res3Head = SortLL1_2_3.sortOneTwoThreeInLL(problem3Head);
//        LLUtilityMethod.displayLL(res3Head);

        //4.
//        int[] problem4Arr = {1, 2, 3, 4, 9, 8};
//        Node problem4Head = LLUtilityMethod.insertArrayElementToLL(problem4Arr);
//        Node res4Head = ReverseRemoveKthNode.reverseRemovekthNode(problem4Head,6);
//        LLUtilityMethod.displayLL(res4Head);


        //5.
//        int[] problem5Arr = {1, 2, 3, 4, 9, 8};
//        Node problem5Head = LLUtilityMethod.insertArrayElementToLL(problem5Arr);
//        LLUtilityMethod.displayLL(problem5Head);
//        Node res5Head = ReverseLL.reverseLL(problem5Head);
//        LLUtilityMethod.displayLL(res5Head);


        //6.
        int[] problem6Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node problem6Head = LLUtilityMethod.insertArrayElementToLL(problem6Arr);
        LLUtilityMethod.displayLL(problem6Head);
        Node res6Head = ReverseNodesInKGroupSize.kReverse(problem6Head, 3);
        LLUtilityMethod.displayLL(res6Head);

    }


}
