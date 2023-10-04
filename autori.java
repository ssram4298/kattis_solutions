import java.util.*;

class autori{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        System.out.printf("%s", s.charAt(0));
        char c = '-';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                System.out.printf("%s", s.charAt(i+1));
            }
        }
    }
}