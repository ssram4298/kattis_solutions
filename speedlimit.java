import java.util.*;

class speedlimit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            if(n==-1){
                break;
            }
            int total = 0, temp=0;
            while(n>0){
                int a = sc.nextInt(); 
                int b = sc.nextInt();
                
                total += a*(b-temp);
                temp = b;
                n--;
            }
            System.out.println(total+" miles");
        }
    }
}