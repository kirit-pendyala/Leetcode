class Solution {
    public int thirdMax(int[] nums)
    {
        int max = 0, secondMax, thirdMaxi;
        secondMax = thirdMaxi = max;
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > max)
            {
                thirdMaxi = secondMax;
                secondMax = max;
                max = nums[i];
                count++;
            }
            else if (nums[i] > secondMax)
            {
                thirdMaxi = secondMax;
                secondMax = nums[i];
                count++;
            }
            else if (nums[i] > thirdMaxi)
            {
                thirdMaxi = nums[i];
                count++;
            }
        }
        return count > 2 ? thirdMaxi : max;
    }
}
