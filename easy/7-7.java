import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        sum = in.nextInt();

        int i = 2;
        List<Integer> list = new ArrayList<Integer>();
        // 55 - 1
        while ((i * (i + 1) * (i - 1) / 6) < sum) {
            if ((sum - i * (i + 1) * (i - 1) / 6) % i == 0) {
                // System.out.println(i);
                list.add(i);
            }
            i++;
        }
        System.out.print('[');
        for (int j = list.size()-1; j >=0; j--) {
            int l = list.get(j);
            // System.out.println(l);
            int start = (sum - l * (l + 1) * (l -1) / 6) / l;
            System.out.print('[');
            
            for (int k = 0; k < l; k++) {
                System.out.print(start + k*(k+1)/2);
                if (k != l - 1) {
                    System.out.print(',');
                    System.out.print(' ');
                }
            }
            System.out.print(']');
            if (j != 0) {
                System.out.print(',');
                System.out.print(' ');
            }
        }
        System.out.println(']');
    }
}