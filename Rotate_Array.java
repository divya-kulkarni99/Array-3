//Time Complexity : O(n)
//Space Complexity : O(n)
class Solution {
    public void rotate(int[] nums, int k) {
      if(nums == null) return;
        int n = nums.length;
        if(k > n){
            k=k%n;
        }
        //reverse whole array,till k-1,k to n-1
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    
    private void reverse(int[] nums, int l, int r){
        //reversing from given two numbers
        while(l < r){
            swap(nums, l, r);
            l++;r--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        //swaping from given two numbers
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}