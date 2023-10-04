import java.util.*;

class hiss{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        char[] c = s.toCharArray();
        boolean flag = false;
        for(int i=1;i<c.length;i++){
            if(c[i-1] == 's' && c[i]=='s'){
                flag = true;
            }
        }
        
        if(flag){
            System.out.println("hiss");
        }
        else{
            System.out.println("no hiss");
        }
    }
}