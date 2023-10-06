import java.util.*;

class lastfactorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int fact = 1;
            for(int i=1;i<=n;i++){
                fact *= i;
            }
            System.out.println(fact%10);
            t--;
        }
    }
}