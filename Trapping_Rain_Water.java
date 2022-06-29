//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int trap(int[] height) {
        int result = 0;
        int l=0;
        int r=height.length-1;
        int lw = 0;
        int rw = 0;
        while(l <= r){
            //which wall is smaller
            if(lw <= rw){
                //left side
                if(lw < height[l]){
                    lw = height[l];
                }//trap water
                else{
                    result = result + lw-height[l];
                }
                l++;
            }else{

                //right side
                if(rw < height[r]){
                    rw = height[r];
                }//trap water
                else{
                    result = result + rw-height[r];
                }
            
                r--;
              }
            }
        return result;
    }
}
