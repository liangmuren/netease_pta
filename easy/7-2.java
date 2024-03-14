import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] ls = line.split("\\|");
        Staff[] g = new Staff[ls.length]; 
        int total = ls.length;
        for(int i=0;i<ls.length;i++){
             Staff s = new Staff();
            g[i] = s;
        }
        for(int i=0;i<ls.length;i++)
        {
            String[] a= ls[i].split(" ");

            for(int j=i+1;j<a.length;j++)
            {
                if("0".equals(a[j]))
                {
                    continue;
                }
                if(Staff.join(g[i],g[j]))
                {
                    total--;
                } 
            }
        }
        System.out.println(total);
    }
    public static class Staff{
        Staff parent = null;
        public Staff(){}
        public Staff getParent(){
            if(parent ==null){
               return this; 
            }
            return parent.getParent();
        }
        public void setParent(Staff p) {
            parent = p;
        }
        public static boolean join(
            Staff a, Staff b
        ){
            Staff ar= a.getParent();
            Staff br = b.getParent();
            if(ar == br){
                return false;
            }
            br.setParent(ar);
            return true;
        }
    } 
}