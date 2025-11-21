// LeetCode 49: Group Anagrams
// Approach: Sort each string to create a canonical key and group by HashMap.
// Time Complexity: O(n * k log k), where k = length of each string
// Space Complexity: O(n * k)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String unsorted = strs[i];
            char[] un = unsorted.toCharArray();
            Arrays.sort(un);
            String sorted = new String(un);

            if(map.containsKey(sorted)){
                map.get(sorted).add(unsorted);
            }else{
                List<String> collection = new ArrayList<>();
                collection.add(unsorted);
                map.put(sorted, collection);
            }
        }

        List<List<String>> result = new ArrayList(map.values());
        return result;
    }
}
