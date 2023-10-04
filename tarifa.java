import java.util.*;

public class tarifa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = x;
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            sum += x-k;
        }
        
        System.out.println(sum);
    }
}