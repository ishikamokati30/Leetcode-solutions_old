class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
       int[] nums1=new int[n];
        for(int i=0;i<n;i++){
            int val=(i+k)%n;
            nums1[val]=nums[i];
        }
         for(int i=0;i<n;i++){
            nums[i]=nums1[i];
         }
         return;
    }
}