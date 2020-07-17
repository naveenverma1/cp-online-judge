// Link : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
     Set<Integer> set  = new HashSet<>();
        List<Integer> list = new ArrayList<>();
       // for(int i :arr){
       //     set.add(i);
       // }
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i =1;i<=arr.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
