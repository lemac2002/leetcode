class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int csum = nums[0];
        for(int i = 1; i < nums.length;i++){
           
            if(csum+ nums[i] < nums[i]){
                csum = nums[i];
            }
            else{
                csum = csum + nums[i]; 
            }
            if(csum > sum)
                sum = csum;
           // System.out.println(sum);
        }
        return sum;
    }
}
