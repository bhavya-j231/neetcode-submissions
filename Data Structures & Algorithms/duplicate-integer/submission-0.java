// hashset -> data structure that checks for duplicate elements

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int it : nums)
        {
            if(st.contains(it))
                return true;

            st.add(it);
        }

        return false;
    }
}