import java.util.*;

class cold{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int counter = 0;
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            if(k<0){
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}