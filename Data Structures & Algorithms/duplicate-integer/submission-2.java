// hashset -> data structure that checks for duplicate elements

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int it : nums)
        {
            if(mpp.containsKey(it))
                return true;

            mpp.put(it, mpp.getOrDefault(it, 0) + 1);
        }

        return false;
    }
}