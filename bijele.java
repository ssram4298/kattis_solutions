import java.util.*;

class bijele{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[6];
        
        for(int i=0;i<6;i++){
            arr[i] = sc.nextInt();
        }
        
        int[] def = new int[] {1,1,2,2,2,8};
        
        int[] res = new int[6];
        
        for(int i=0;i<6;i++){
            res[i] = def[i]-arr[i];
            System.out.print(res[i]+" ");
        }
        System.out.println();
        
        
    }
}