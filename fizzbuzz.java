import java.util.*;

class fizzbuzz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            if(i%x == 0 && i%y==0){
                System.out.printf("FizzBuzz");
            }
            else if(i%x==0){
                System.out.printf("Fizz");
            }
            else if(i%y==0){
                System.out.printf("Buzz");
            }
            else{
                System.out.printf("%d", i);
            }
            System.out.printf("\n");
        }
    }
}