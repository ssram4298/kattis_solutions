import java.util.*;

class everywhere{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt(), count = 0;
            HashMap <String, String> map = new HashMap<>();
            while(n>0){
                String city = sc.next();
                if(!map.containsKey(city)){
                    count++;
                    map.put(city,"visited");
                }
                n--;
            }
            t--;
            System.out.println(count);
        }

        
    }
}