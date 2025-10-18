package Stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> q;
    static int size;

    public ImplementStackUsingQueue(){
        q = new ArrayDeque<>();
    }

    public void push(int val){
        q.add(val);
        size++;
        for (int i = 0; i < size-1; i++) {
            q.add(q.remove());
        }
    }

    public void pop(){
        q.remove();
        size--;
    }

    public int top(){
        return q.peek();
    }

    public boolean empty(){
        return q.isEmpty();
    }

}
