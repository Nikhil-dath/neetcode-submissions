class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int max_water = 0;

        while(i < j){
            int temp_max_water = (j-i) * Math.min(heights[i],heights[j]);
            
            if(temp_max_water > max_water){
                max_water = temp_max_water;
            }   

            if (heights[i] < heights[j]) {
                i++ ;
            } 
            else {
                j--;
            }

        }
        return max_water;
    }
}


























