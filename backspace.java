import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		s = new StringBuilder(s).reverse().toString();
		String res = "";
		int counter = 0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='<'){
		           counter++;
		    }
		    else{
		        if(counter>0){
                    counter--;
		        }
		        else{
		            res+=s.charAt(i);
		        }
		    }
		}
		
		res = new StringBuilder(res).reverse().toString();
		
		System.out.println(res);
	}
}
