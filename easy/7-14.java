import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] actions = in.nextLine().split(",");
        String[] pramas = in.nextLine().split(",");
        String result = "";
        MinStack stack = new MinStack();
        for(int i=0;i<actions.length;i++){
            String action = actions[i];
            if(i>0){
                result+=",";
            }
            switch(action){
                case "push":
                    stack.push(Integer.parseInt(pramas[i]));
                    result += "null";
                    break;
                case "getMin":
                    result+= stack.getMin();
                    break;
                case "pop":
                    stack.pop();
                    result += "null";
                    break;
                case "top":
                    result+= stack.top();
                    break;
            }
        }
        System.out.println(result);
    }

    public static class MinStack{
        private Stack<Integer> stack;
        private int min;
        MinStack(){
            this.stack = new Stack();
        }

        public void push(int val){
            if(stack.isEmpty()){
                this.min = val;
                stack.push(0);
            }else{
                int diff = val - this.min;
                stack.push(diff);
                if(diff < 0){
                    this.min = val;
                }
            }
        }

        public void pop(){
            int pop = stack.pop();
            if (pop<0){
                this.min = this.min - pop;
            }

        }

        public int top(){
            int top = stack.peek();
            if(top<0){
                return min;
            }
            return top + this.min;
        }

        public int getMin(){
            return this.min;
        }
    }
}