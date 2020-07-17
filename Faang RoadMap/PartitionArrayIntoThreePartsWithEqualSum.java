// Link : https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/

class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        for(int i : A)
             sum +=i;
     
       
        int avr = sum/3;
        int count =0;
        int res=0;
        for(int i =0;i<A.length;i++){
             res +=A[i];
            if(res==avr){
                count++;
                res=0;
            } 
            if(count==3){
          return true;
        }
            
        }
      
       return false;
    }
}