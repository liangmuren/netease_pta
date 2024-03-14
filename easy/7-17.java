import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line1 = in.nextLine().split(" ");
        String[] line2 = in.nextLine().split(" ");
        // System.out.println(line1.length);
        int[] nums1 = new int[line1.length];
        int sum1=0;
        for(int i=0;i<line1.length;i++){
            nums1[i] = Integer.parseInt(line1[i]);
            sum1 +=  nums1[i];
        }
        int[] nums2 = new int[line2.length];
        int sum2=0;
        for(int i=0;i<line2.length;i++){
            nums2[i] = Integer.parseInt(line2[i]);
            sum2 +=  nums2[i];
        }
        // System.out.println("123");
        // sum1 -x +y = sum2 +x-y
        // y = (sum2-sum1)/2+x
        if((sum2 -sum1)%2==1){
            System.out.println("");
            return;
        }
        int diff = (sum2 -sum1)/2;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] + diff == nums2[j]){
                    System.out.println(nums1[i]+ " "+ nums2[j]);
                    return;
                }
            }
        }
        System.out.println("");
        return;
    }
}