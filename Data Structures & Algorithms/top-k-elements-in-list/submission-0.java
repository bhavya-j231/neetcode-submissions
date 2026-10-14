class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int it : nums)
        {
            mpp.put(it, mpp.getOrDefault(it, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for(int it : mpp.keySet())
        {
            pq.offer(new int[]{it, mpp.get(it)});

            if(pq.size() > k)
                pq.poll();
        }

        int[] ans = new int[k];

        int j = 0;
        
        while(!pq.isEmpty())
        {
            ans[j++] = pq.poll()[0];
        }

        return ans;
    }
}
