import java.util.*;

class spavanac{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        m -= 45;
        
        if(m<0){
            h -= 1;
            m += 60;
        }
        if(h<0){
            h=23;
        }
        
        System.out.printf("%d %d",h,m);
        
    }
}