import java.util.*;
import java.lang.*;

class planina{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int sum = (int)Math.pow((Math.pow(2,n)+1),2);
        
        System.out.println(sum);
    }
}