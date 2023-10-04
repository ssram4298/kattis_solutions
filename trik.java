import java.util.*;

class trik{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        
        int[][] arr = {{1,0,2},{-1,1,0},{0,-1,-2}};
    
        int res = 1;
        for(int i=0;i<c.length;i++){
            res += arr[res-1][c[i] - 'A'];
        }
        System.out.println(res);
    }
}