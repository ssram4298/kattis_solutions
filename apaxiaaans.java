import java.util.*;

class apaxians{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        System.out.print(c[0]);
        for(int i=1;i<c.length;i++){
            if(c[i]!=c[i-1]){
                System.out.print(c[i]);
            }
        }
        System.out.println();
        sc.close();
    }
}