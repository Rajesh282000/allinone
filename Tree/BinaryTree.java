package Tree;

import java.util.Scanner;

public class BinaryTree {

    BinaryTree() {

    }
    private static class Node {
        private int value;
        private Node left;
        private Node right;
        Node(int value) {
            this.value = value;
        }
    }

    private Node root;


    //insert element in the tree
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of(Enter true or false:) " + node.value );
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left node: ");
            int leftVal = scanner.nextInt();
            node.left = new Node(leftVal);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of(Enter true or false:) " + node.value );
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right node: ");
            int rightVal = scanner.nextInt();
            node.right = new Node(rightVal);
            populate(scanner, node.right);
        }

    }
    public void display(){
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null)
            return;
        System.out.println(indent + node.value );
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

   public void prettyDisplay() {
       prettyDisplay(root, 0);
   }

   private void prettyDisplay(Node node, int level) {
       if (node == null)
           return;
       prettyDisplay(node.right, level + 1);
       if(level!=0){
           for (int i = 0; i < level-1; i++)
               System.out.print(" |\t\t");
           System.out.println("----->"+node.value);
       }else {
           System.out.println(node.value);
       }
       prettyDisplay(node.left, level + 1);
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.prettyDisplay();
    }
}
