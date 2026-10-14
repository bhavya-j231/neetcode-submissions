class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int s2 = target - nums[i];
            for(int j = i + 1; j < n; j++)
            {
                if(nums[j] == s2)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return ans;
    }
}
