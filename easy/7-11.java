import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int k = in.nextInt();
        String[] tickets = a.split(" ");
        // 第k个需要的票数
        int count = Integer.parseInt(tickets[k]);
        int time = 0;
        for(int i=0;i<tickets.length;i++){
            // 第i个人要买的票数
            int c = Integer.parseInt(tickets[i]);
            if(i<=k){
                if(c>=count){
                    time+=count;
                }else{
                    time+=c;
                }
            }else{
                if(c>=count-1){
                    time+=count-1;
                }else{
                    time+=c;
                }
            }
        }
        System.out.println(time);
    }
}