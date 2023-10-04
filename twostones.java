import java.util.*;

public class twostones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String result = (n%2==0)?"Bob":"Alice";
        
        System.out.println(result);
    }
}