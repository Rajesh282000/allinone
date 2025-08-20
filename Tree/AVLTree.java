package Tree;

public class AVLTree {

    private class Node {
        int value;
        int height;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;
    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    AVLTree() {

    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
      //  return rotate(node);
        return node;
    }
//    private Node rotate(Node node) {
//        if (height(node.left) - height(node.right) > 1) {
//            //left heavy
//            if (height(node.left.left) - height(node.left.right) > 0) {
//                //left left case
//                return rotateRight(node);
//            }
//
//            if(height(node.left.left) - height(node.left.right) < 0){
//                //left right case
//                node.left = rotateLeft(node.left);
//                return rotateRight(node);
//            }
//        }
//
//            return node;
//    }




    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return  Math.abs(leftHeight - rightHeight) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, "Left child of "+ node.value + ": ");
        display(node.right, "right child of "+ node.value + ": ");
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);

    }
    private void populateSorted(int[] nums, int start, int end) {
       while(start <= end){
           return ;
       }

       int mid = (start + end) / 2;
       insert(nums[mid]);
       populateSorted(nums, start, mid - 1);
       populateSorted(nums, mid + 1, end);
    }

//    Travesal
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        AVLTree bst = new AVLTree();
        int[] arr = {5, 3, 7, 2, 4, 6, 8, 1, 9};
        bst.populate(arr);
        bst.display();
    }
}
