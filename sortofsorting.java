import java.util.*;

class sortofsorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            sc.nextLine();
            if(n==0){
                break;
            }
            String[] arr = new String[n];
            
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLine();
            }
            Arrays.sort(arr, Comparator.comparing(k -> k.substring(0, 2)));
            
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
            System.out.println();
        }
    }
}