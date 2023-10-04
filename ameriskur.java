import java.util.*;

class ameriskur{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double val = 0.09144d;
        
        System.out.printf("%.5f", n*val);
    }
}