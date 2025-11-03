import java.util.HashMap;

public class DP{

     public static int nthFibo(int n, HashMap<Integer, Integer> hm){//n =10
        if(n==1)return 0;
        if(n==2)return 1;
        if(hm.containsKey(n))return hm.get(n);


        int ans = nthFibo(n-1, hm)+nthFibo(n-2, hm);
        hm.put(n,ans);
        return ans;
     } 
    public static void main(String[] args) {
        
        int n =50;
        System.out.println("nth " +n+" fibo no is: "+nthFibo(n));

    }
}