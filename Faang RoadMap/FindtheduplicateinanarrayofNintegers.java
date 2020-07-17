// https://leetcode.com/problems/find-all-duplicates-in-an-array/


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList();
        int n = nums.length;
for(int i =0;i<n;i++){
    int index = Math.abs(nums[i])-1;
    if(nums[index]<0) list.add(index+1);
    nums[index] = -nums[index];
}
        return list;
    }
}