import java.util.*;
import java.lang.*;

public class pot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long result = 0L;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int pow = x%10;
            int num = x/10;
            result += Math.pow(num, pow);
        }
        System.out.println(result);
    }
}