import java.util.*;

public class abc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[3];
        for(int i=0;i<3;i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        
        char[] arr = sc.next().toCharArray();
        
        for(int i=0;i<arr.length;i++){
            int c = nums[arr[i]-'A'];
            System.out.printf("%d ", c);
        }
        
        
    }
}