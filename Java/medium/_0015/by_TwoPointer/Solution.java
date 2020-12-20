package medium._0015.by_TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        int l, r, target, tmp;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < len; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            l = i + 1; r = len - 1; target = -nums[i];
            while(l < r){
                if(nums[l] + nums[r] == target){
                    List list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while(l < r - 1 && nums[l] == nums[l+1])l++;
                    while(r > l + 1 && nums[r] == nums[r-1])r--;
                    l++;
                    r--;
                }else if(nums[l] + nums[r] > target){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }
}