import java.util.*;

class flip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(), b = sc.nextInt();
        int rev_a=0, rev_b=0;
        while(a!=0){
            rev_a = rev_a*10 + a%10;
            a = a/10;
        }
        while(b!=0){
            rev_b = rev_b*10 + b%10;
            b = b/10;
        }
        
        int result = (rev_a>rev_b)?rev_a:rev_b;
        
        System.out.println(result);
    }
}