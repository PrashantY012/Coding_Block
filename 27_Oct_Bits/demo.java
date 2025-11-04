import java.security.KeyStore.Entry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

// class Solution {

//     public boolean searchMatrix(int[][] mat, int target) {
//         int row=mat.length;
//         int col = mat[0].length;

//         int r =0,c= col-1;
//         boolean ans=false;
//         while(true){

//             if(r<0||r>=row||c<0||c>=col)break;
//             if(mat[r][c]==target){
//                 ans =true;
//                 break;
//             }
//             if(mat[r][c]>target){
//                 c--;
//             }else{
//                 r++;
//             }
//         }
//         return ans;
//     }
// }

// User function Template for Java
class Solution {
    static int kruskalsMST(int v, int[][] edges) {
        // code here
        int max_value = Integer.MAX_VALUE;
        int ans=0;
        // PriorityQueue<int []>pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        TreeMap<int[],Integer> mp = new TreeMap<>((a,b)->a[0]!=b[0] ? a[0]-b[0]:a[1]-b[1]);
        List<List<List<Integer>>> al= new ArrayList<>();

        for(int i=0;i<v;i++)al.add(new ArrayList<>());

        for(int [] edg:edges){
            int u =edg[0];
            int vn=edg[1];
            int d=edg[2];
            al.get(u).add(Arrays.asList(vn,d));
            al.get(vn).add(Arrays.asList(u,d));

        }

        int visited[]= new int[v];
        for(int i=0;i<v;i++)visited[i]=max_value;//not visited
        // pq.add(new int[]{0,0});
        mp.put(new int[]{0,0},1);

        while(mp.size()>0){
            int [] top = mp.firstKey();
            mp.remove(top);
            if(visited[top[1]]==-1)continue;
            visited[top[1]]=-1; //marking visited
            int d= top[0], u=top[1];
            ans+=d;
            for(List<Integer> ls:al.get(u)){
                int vn = ls.get(0);
                int w  = ls.get(1);
                if(visited[vn]!=-1 ){
                    // pq.add(new int[]{w,vn});
                    // mp.remove(new int[]{visited[vn],w});
                    mp.put(new int[]{w,vn},4);
                    // visited[vn]=w;
                }
            }
        }
        return ans;
    }
}

 class Pair{
        int a; int b;
        Pair(int a, int b){
            this.a =a;
            this.b =b;
        }

        @Override
        public boolean equals(Object o){
            if(this == o)return true;
            if(!(o instanceof Pair))return false;
            Pair p = (Pair) o;
            return this.a==p.a && this.b==p.b;
        }

        @Override
        public int hashCode(){
            return 31*a+b;
        }
    }



     class customSort implements Comparator<Integer>{
        @Override
        public int compare(Integer a, Integer b){
            if(a%2 ==0 && b%2==0 || a%2==1 && b%2==1)return 0;
            if(a%2==1)return 1;
            return 0;
        }
    }

public class demo{

    public void treeMap(){
           TreeMap<Integer[],Integer> mp = new TreeMap<>((a,b)->a[0]!=b[0]? a[0]-b[0]: a[0]-b[0]);
        Integer[] key = new Integer[]{8,3};
        mp.put(key,5);
        mp.put(new Integer[]{11,3},5);
        mp.put(new Integer[]{6,3},5);
        mp.put(new Integer[]{6,4},5);
        mp.put(new Integer[]{6,5},5);

        key[0]=21;

        // System.out.println()
        // mp.remove(new Integer[]{6,4});
        mp.forEach((k,v)->System.out.println("key:"+k[0]+" "+k[1]+"  value:"+v));
        System.out.println(Arrays.toString(mp.firstKey()));
    }
   
    public static void hashMap(){
        HashMap<Pair, Integer> hm = new HashMap<>();
        hm.put(new Pair(1,2),3);
        hm.put(new Pair(2,1),3);
        hm.put(new Pair(1,2),3);

        hm.forEach((k,v)->System.out.println("key:"+k.a+" "+k.b+"  value:"+v));
    }



   
    public static void main(String[] args) {
        hashMap();

        Integer arr[]= {5,3,2,8,1,4};
        Arrays.sort(arr, new customSort());
        System.out.println(Arrays.toString(arr));

     
    }
}