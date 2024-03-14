import java.util.Scanner;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        in.close();
        String[] strs1 = line1.split(",");
        if(strs1.length == 1) {
            System.out.println(strs1[0]);
            return;
        }
        PriorityQueue<Integer> stack = new PriorityQueue<>(strs1.length, (a, b) -> b - a);
        for (int i = 0; i < strs1.length; i++) {
            stack.add(Integer.parseInt(strs1[i]));
        }
        while (stack.size() > 1) {
            int a = stack.poll();
            int b = stack.poll();
            if(a != b) {
                stack.add(a - b);
            }
            // 如果没有剩下的了，输出0
            if (stack.size() == 0) {
                System.out.println(0);
                return;
            }
            // 如果剩下一个，输出这个
            if (stack.size() == 1) {
                System.out.println(stack.poll());
                return;
            }
        }
    }
}