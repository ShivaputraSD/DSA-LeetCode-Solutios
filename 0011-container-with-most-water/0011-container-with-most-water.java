class Solution {
    public int maxArea(int[] height) {
        int curr_water=0;
        int max_water=0;
        int i=0,j=height.length-1;
        while(i<j){
            curr_water=height[(height[i]<height[j])?i:j]*(j-i);
            if(curr_water>max_water)
                max_water=curr_water;
            if(height[i]<height[j])i++;else j--;
        }
        return max_water;
        
        
    }
}