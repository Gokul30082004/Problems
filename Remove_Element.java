class Solution {
    public int removeElement(int[] nums, int val) {
        int k=nums.length-1;
        for(int i=0;i<=k;i++){
            if(nums[i]==val){
                nums[i]=nums[k];
                --k;
                --i;
            }
        }
        return k+1;
    }
}
