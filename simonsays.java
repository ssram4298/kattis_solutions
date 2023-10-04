import java.util.*;

class simonsays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        while(n>0){
            n--;
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");

            if(s.contains("Simon says")){
                for(int i=2;i<arr.length;i++){
                    System.out.print(arr[i]+" "); 
                }
                System.out.print("\n");
            }
        }
    }
}