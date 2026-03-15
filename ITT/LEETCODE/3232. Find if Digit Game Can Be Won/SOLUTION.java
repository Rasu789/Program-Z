class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]< 10)
            {
                b+=nums[i];
            }
            else
            {
               a+=nums[i];
            }
        }
        return b!=a;
    }
}
