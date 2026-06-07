class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i,j;
        double sum=0.0;
        for(i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxs=sum;
        for(j=k;j<nums.length;j++){
            sum=sum+nums[j]-nums[j-k];
            
            maxs=Math.max(maxs,sum);
        }
        return (double)(maxs/k);
    }
}
