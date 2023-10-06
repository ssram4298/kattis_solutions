import java.util.*;
import java.lang.*;

class aboveaverage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int avg = sum/n;
            int count = 0;
            for(int i=0;i<n;i++){
                if(arr[i]>avg)  count++;
            }
            float res = count*100.0f/n;
            System.out.printf("%.3f%%%n", res);
            sc.nextLine();
            t--;
        }
    }
}