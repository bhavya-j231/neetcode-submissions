class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        HashMap<Integer, Integer> mpp = new HashMap<>();
        HashMap<Integer, Integer> mpp2 = new HashMap<>();
        int prod = 1;

        for(int i = 0; i < n; i++)
        {
            prod *= nums[i];
            mpp.put(i, prod);
        }

        prod = 1;

        for(int i = n - 1; i >= 0; i--)
        {
            prod *= nums[i];
            mpp2.put(i, prod);
        }

        // (1,0) (2, 1) (8, 2) (48, 3)
        // (6, 3) (24, 2) (48, 1) (48, 0)

        // value at index k = [0, k) * (k, 3]
        // value at index 0 = (0, last] mpp2
        // value at index last = [0, last)

        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                ans[i] = mpp2.get(1);
            }
            else if(i == n-1)
            {
                ans[i] = mpp.get(n - 2);
            }
            else
            {
                ans[i] = mpp.get(i - 1) * mpp2.get(i + 1);
            }
        }

        return ans;
    }
}  
