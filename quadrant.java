import java.util.*;

class quadrant{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        
        if(a>0 && b>0){
            System.out.println(1);
        }
        else if(a>0 && b<0){
            System.out.println(4);
        } 
        else if(a<0 && b>0){
            System.out.println(2);
        }
        else{
            System.out.println(3);
        }
    }
}