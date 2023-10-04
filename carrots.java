import java.util.*;

class carrots{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        String[] arr = new String[m];
        for(int i=0;i<m;i++){
            arr[i] = sc.nextLine();
        }
        
        System.out.println(n);
    }
}