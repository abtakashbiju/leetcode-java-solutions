// LeetCode 1: Two Sum
// Approach: HashMap for complement lookup – O(n) time, O(n) space.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for(int i=0; i<nums.length; i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                result[0]=map.get(rem);
                result[1]=i;
                return result;
            }else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
