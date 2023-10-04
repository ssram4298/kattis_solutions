import java.util.*;

class nastyhacks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n>0){
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            
            int p = e-r;
            if(p>c){
                System.out.println("advertise");
            }
            else if(p==c){
                System.out.println("does not matter");
            }
            else{
                System.out.println("do not advertise");
            }
            n--;
        }
    }
}