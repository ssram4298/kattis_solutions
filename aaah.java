import java.util.*;

class aaah{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        if(s1.length() >= s2.length()){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }
    }
}