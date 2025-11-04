import java.util.*;
class Triplet implements Comparable<Triplet>{
    int a,  b,  c;
    Triplet(int a, int b, int c){
        this.a=a;
        this.b = b;
        this.c =c;
    }

   @Override
    public int compareTo(Triplet other) {
        // Compare 'a' first
        if (this.a != other.a) {
            return this.a - other.a;
        }
        // If 'a' is equal, compare 'b'
        if (this.b != other.b) {
            return this.b - other.b;
        }
        // If 'a' and 'b' are equal, compare 'c'
        return this.c - other.c;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ||  (obj instanceof Triplet) == false) return false;
        Triplet triplet = (Triplet) obj;
        return a == triplet.a && b == triplet.b && c == triplet.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        Map<Triplet, Integer> ansMap = new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int last = (0-(nums[i]+nums[j]));
                if(mp.containsKey(last)==true){
                    int ind = mp.get(last);
                    if(ind> j){
                        ansMap.put(new Triplet(nums[i], nums[j], last), 1);
                    }
                }
            }
        }

        List<List<Integer>>ans = new ArrayList<>();
        for(Triplet tri: ansMap.keySet()){
            ans.add(Arrays.asList(tri.a, tri.b, tri.c));
        }
        return ans;
    }
}