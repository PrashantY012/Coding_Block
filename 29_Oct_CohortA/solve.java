import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<k-1;i++){
            pq.add(new int[]{nums[i],i});
        }
        
        int n =nums.length;
        int ans []= new int[n-k+1];
        int ansIndex=0;

        for(int i=k-1;i<n;i++){

            pq.add(new int[]{nums[i],i});

            //check if top element is part of window or not
            while(pq.size()>0){
                //check if it is part of current window
                int topIndex=pq.peek()[1];
                if(i-topIndex<k){
                    break;//no issues
                }else{
                    pq.remove();
                }
            }

            ans[ansIndex]=pq.peek()[0];
            ansIndex++;
        }
        return ans;
    }
}