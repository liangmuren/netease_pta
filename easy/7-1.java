import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
public class Main {

    /**
     * MyQueue
     */
    public static class MyQueue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public int peek() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        String[] strs1 = line1.split(",");
        String[] strs2 = line2.split(",");
        MyQueue queue = new MyQueue();
        for (int i = 0; i < strs1.length; i++) {
            if("push".equals(strs1[i])){
                queue.push(Integer.parseInt(strs2[i]));
                System.out.print("null");
            } else if("pop".equals(strs1[i])){
                System.out.print(queue.pop());
            } else if("peek".equals(strs1[i])){
                System.out.print(queue.peek());
            } else if("empty".equals(strs1[i])){
                System.out.print(queue.empty());
            }
            if(i != strs1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("");
    }
}