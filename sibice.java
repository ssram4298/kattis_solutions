import java.util.*;
import java.lang.*;

class sibice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int w = sc.nextInt(), h = sc.nextInt();
        int hyp = (int)Math.floor(Math.hypot(w,h));
        while(n>0){
            int k = sc.nextInt();
            if(k<=hyp){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
            n--;
        }
    }
}