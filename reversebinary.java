import java.util.*;

class reversebinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String s = Integer.toBinaryString(n);
		s = new StringBuilder(s).reverse().toString();
		
		int res = Integer.parseInt(s,2);
		
		System.out.println(res);
    }
}