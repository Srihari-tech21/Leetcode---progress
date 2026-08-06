class Solution {
    public int finalElement(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        int first=nums[0];
        int last=nums[nums.length-1];
        int result;
        
        if(first>last)
        {
            result=first;
        }
        else
        {
            result=last;
        }
        return result;
    }
}