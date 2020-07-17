// Link : https://leetcode.com/problems/insert-interval/


class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];
        List<int[]> list = new ArrayList();
        
        for(int[] interval: intervals){
            int currstart = interval[0];
            int currend = interval[1];
            if(currend<start){
                list.add(new int[]{currstart,currend});
            }else if(currstart>end){
                list.add(new int[]{start,end});
                start= currstart;
                end = currend;
            }else{
                start = Math.min(start,currstart);
                end = Math.max(end,currend);
            }
        }
        list.add(new int[]{start,end});
        int res[][] = new int[list.size()][2];
         for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
        
    }
}