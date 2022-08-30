class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      HashMap<Integer,Integer> map  = new HashMap<Integer,Integer>();
        int[] arr = new int[2];
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                arr[1] = i;
                arr[0] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}