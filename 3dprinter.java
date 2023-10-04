import java.util.*;

class printer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = (int)(Math.ceil(Math.log(n)/Math.log(2))+1);
        System.out.println(res);
    }
}