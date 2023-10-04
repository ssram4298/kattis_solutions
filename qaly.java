import java.util.*;

class qaly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double result = 0d;
        while(n>0){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            result += a*b;
            n--;
        }
        
        System.out.printf("%.3f", result);
    }
}