class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            //Step1: Sum create kr 
            sum = sum + nums[i];
            //Step2: maxi update kr
            maxi = Math.max(maxi, sum);
            //Step3: sum check kr negative value sathi
            if(sum<0) {
                sum = 0 ;
            }
        }
        //return max value
        return maxi;
    }
    
}