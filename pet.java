import java.util.*;

class pet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = 1, number=0, points=0;
        while(n<6){
            int sum = 0;
            int k=4;
            while(k>0){
                sum += sc.nextInt();
                k--;
            }
            if(sum>points){
                points = sum;
                number = n;
            }
            n++;
        }
        
        System.out.println(number+" "+points);
    }
}