import java.util.*;

class hardgreining{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        String result = s.contains("COV")?"Veikur!":"Ekki Veikur!";
        
        System.out.println(result);
    }
}