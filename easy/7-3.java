// Drizzle 前往山地统计大山的数目，现在收到这片区域的地图，地图中用0（平地）和1（山峰）绘制而成，请你帮忙计算其中的大山数目。

// 山总是被平地四面包围着，每一座山只能在水平或垂直方向上连接相邻的山峰而形成。一座山峰四面被平地包围，这个山峰也算一个大山。

// 另外，你可以假设地图的四面都被平地包围着。



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] ls = line.split(" ");
        int m = Integer.parseInt(ls[0]);
        int n = Integer.parseInt(ls[0]);

        Staff[][] g = new Staff[m][n];
        String[][] a = new String[m][n];
        int index = 0;
        while (in.hasNextLine()) {
            a[index] = in.nextLine().split(" ");
            index++;
        }
        int total = m*n;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Staff s = new Staff();
                g[i][j] = s;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if("0".equals(a[i][j]))
                {
                    total--;
                    continue;
                }
                boolean merge = false;
                if(i>0 &&"1".equals(a[i-1][j])){
                    merge = Staff.join(g[i][j],g[i-1][j]);
                }
                if(!merge && j>0 &&"1".equals(a[i][j-1])){
                    merge = Staff.join(g[i][j],g[i][j-1]);
                }
                if(merge){
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