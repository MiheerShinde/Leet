class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n] ;
        int rigthSum[] = new int[n] ;

        // Fill Left Array
        leftSum[0] = nums[0] ;
        for(int i=1; i<n; i++) {
            leftSum[i] = leftSum[i-1] + nums[i] ;
        }

        // Fill Rigth Array
        rigthSum[n-1] = nums[n-1] ;
        for(int i=n-2; i>=0; i--) {
            rigthSum[i] = rigthSum[i+1] + nums[i] ;
        }
        // Check for Equality
        for(int i=0; i<n; i++) {
            if(leftSum[i] == rigthSum[i]) {
                return i;
            }
        }
        return -1;
    }
}