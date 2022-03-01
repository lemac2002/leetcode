class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new  HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            a.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int m = target - nums[i];
            if(a.containKey(m)){
                result[0] = i;
                result[1] = a.get(m);
                return result;
            }
        }
        return null;
            
    }
}
