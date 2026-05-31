package Tree;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){
    }
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();

            for (int i = 0; i < levelNum; i++) {
                TreeNode node = queue.poll();
                subList.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            list.add(subList);
        }
        return list;
    }

    public List<Integer> preOrderTraversal(TreeNode root) {
       List<Integer> preOrder = new ArrayList<Integer>();
        if (root == null) return preOrder;

        Stack<TreeNode> stack = new  Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()) {
           root = stack.pop();
            preOrder.add(root.val);

                if (root.left != null) stack.push(root.left);
                if (root.right != null) stack.push(root.right);

        }
        return preOrder;
    }

    public List<Integer> postOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        List<Integer> postOrder = new ArrayList<Integer>();
        if (root == null) return postOrder;


        stack1.push(root);

        while (!stack1.isEmpty()) {
            root = stack1.pop();
           stack2.push(root);

            if (root.left != null) stack1.push(root.left);
            if (root.right != null) stack1.push(root.right);

        }

        while (!stack2.isEmpty()){
            postOrder.add(stack2.pop().val);
        }

        return postOrder;
    }


}
