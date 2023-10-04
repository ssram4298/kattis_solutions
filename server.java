import java.util.*;

public class server{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int total = sc.nextInt();
        int counter = 0;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt();
            sum += k;
            
            if(sum<=total)
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}