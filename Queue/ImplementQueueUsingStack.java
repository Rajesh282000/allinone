package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ImplementQueueUsingStack {

        Stack<Integer> input;
        Stack<Integer> output;

        public ImplementQueueUsingStack() {
            input = new Stack<>();
            output = new Stack<>();
        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            if (output.isEmpty()) {
                transfer();
            }
            return output.pop();
        }

        public int top() {
            if (output.isEmpty()) {
                transfer();
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }

        private void transfer() {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }



}
