class Solution {
    public int maxArea(int[] height) {
        int n,f=0,s,h=height[0],w=0;
        n=height.length;
        s=n-1;
        int maxi=0;
        for(int i=0;i<n;i++){
            h=Math.min(height[f],height[s]);
            w=s-f;
            maxi=Math.max(maxi,(h*w));
            if(height[f]>height[s])
            s--;
            else
            f++;

        }
        return maxi;
    }
}
