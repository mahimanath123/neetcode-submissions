class Solution {
    public int trap(int[] height) {
         if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int leftmax = height[l], rightMax = height[r];
        int res = 0;
        while(l<r){
            if(leftmax <= rightMax){
                l++;
                leftmax=Math.max(height[l],leftmax);
                res+=leftmax-height[l];
            }else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}
