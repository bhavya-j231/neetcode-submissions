class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            int s2 = target - nums[i];
            if(mpp.containsKey(s2))
            {
                ans[0] = mpp.get(s2);
                ans[1] = i;

                return ans;
            }

            mpp.put(nums[i], i);
        }

        return ans;
    }
}
