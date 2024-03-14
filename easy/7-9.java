import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int sum = in.nextInt();
            if(sum<=0){
                 System.out.println(-1);
                return;
            }
            int num5 = sum/5;
            int num2 = (sum - 5*num5)/2;
            System.out.println(num5 + num2 + (sum - 5*num5- 2*num2));
            return;
        }
    }
}