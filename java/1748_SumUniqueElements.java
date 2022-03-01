class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] a = new int[101];
        for(int i = 0; i < nums.length; i++){
            a[nums[i]]++;
        }
        for(int i = 1; i < 101; i++){
            if(a[i] == 1)
                sum += i;
        }
       
      //  for (Integer key : a.keySet()) {
        //    if(a.get(key) == 1){
          //      sum += key;
           // }
       // }
        return sum;
    }
}
