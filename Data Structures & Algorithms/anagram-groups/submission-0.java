class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        // HashSet<char[]> st = new HashSet<>();

        // for(String st : strs)
        // {
        //     char[] arr = st.toCharArray();
        //     Arrays.sort(arr);

        //     st.add(arr);
        // }

        // int n = st.size();

        // for(int i = 0; i < n; i++)
        // {
        //     ans.add(new ArrayList<>());
        // }

        HashMap<String, ArrayList<String>> mpp = new HashMap<>();

        for(String st : strs)
        {
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            mpp.put(s, new ArrayList<>());
        }

        for(String st : strs)
        {
            char[] arr = st.toCharArray();

            Arrays.sort(arr);
            String s = new String(arr);
            mpp.get(s).add(st);
        }
        int j = 0;
        for(String arr : mpp.keySet())
        {
            ans.add(new ArrayList<>());
            for(int i = 0; i < mpp.get(arr).size(); i++)
            {
                ans.get(j).add(mpp.get(arr).get(i));
            }
            j++;
        }

        return ans;
    }
}
