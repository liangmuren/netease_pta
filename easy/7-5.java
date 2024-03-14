import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 读取一行
        String line = in.nextLine();
        // 新建一个字符串保存结果
        String result = "";
        // 遍历每个字符
        for (int i = 0; i < line.length(); i++) {
            // 输出每个字符
            char c = line.charAt(i);
            // 如果是大写字母，转换为小写字母
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            // 如果不是小写字母或者数字，跳过
            if (!(c >= 'a' && c <= 'z' || c >= '0' && c <= '9')) {
                continue;
            }
            // 保存当前字符
            result += c;
        }
        for (int i = 0; i < result.length()/2; i++) {
            if (result.charAt(i) != result.charAt(result.length()-1-i)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
        return;
    }
}