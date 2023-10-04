import java.util.*;

class oddities{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt();
            String s = (k%2==0)?"even":"odd";
            // System.out.printf("%d is %s\n", k, s);
            System.out.println(k+" is "+s);
        }
    }
}