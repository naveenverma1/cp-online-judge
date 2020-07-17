
// Link : https://leetcode.com/problems/first-missing-positive/
class Solution {
    public int firstMissingPositive(int[] nums) {
       int val =1;
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==val)
                val+=1;
        }
        return val;   
    }
}

