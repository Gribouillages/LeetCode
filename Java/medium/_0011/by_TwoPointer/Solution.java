package medium._0011.by_TwoPointer;

class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;
        while(l < r){
            res = Math.max(res, (r - l) * Math.min(height[l],height[r]));
            if(height[l] < height[r]) l++;
            else r--;
        }
        return res;
    }
}