import java.util.*;

public class metronome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double result= n/4d;
        
        System.out.printf("%.2f", result);
    }
}