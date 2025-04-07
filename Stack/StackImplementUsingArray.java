package Stack;

public class StackImplementUsingArray {
   private int maxSize;
   private int[] stackArr;
    private int top ;

    StackImplementUsingArray(int size){
        this.maxSize = size;
        stackArr = new int[maxSize];
        top =-1;
    }
  public boolean isFull(){
        return top == maxSize-1;
  }
  public  boolean isEmpty(){
        return top == -1;
  }

  public void push(int add){
        if(isFull()){
            System.out.println("Stack is full, Can't push "+add);
            return;
        }

      stackArr[++top] = add;

  }

  public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty. Cant pop.");


        }
       return stackArr[top--];
  }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        return stackArr[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackImplementUsingArray stack =  new StackImplementUsingArray(5);
        stack.push(5);
        stack.push(8);
        stack.peek();
        stack.display();
        stack.pop();
        stack.display();

    }

}
