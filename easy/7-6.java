import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 读取一行
        String line = in.nextLine();
        // ,分割
        String[] strs = line.split(",");
        String a = strs[0];
        String b = strs[1];
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(!map.containsKey(c)){
                if(map.containsValue(b.charAt(i))) {
                    System.out.println(0);
                    return;
                }
                map.put(c, b.charAt(i));
            } else {
                if(map.get(c) != b.charAt(i)) {
                    System.out.println(0);
                    return;
                }

            }
        }
        System.out.println(1);
    }
}