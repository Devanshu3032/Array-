class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       int[] ans = new int[2] ;
       for(int i = 0;i<ans.length;i++ ){
        for(int j = i+1; j<ans.length;j++){
            if(nums[i]+nums[j]==target){
           ans[0] = i;
           ans[0] = j ;
           return ans ; 

            }
        }
       }
        return ans;
    }
}
       