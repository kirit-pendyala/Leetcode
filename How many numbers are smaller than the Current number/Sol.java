class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums)
    {
        int res[] = new int[nums.length];
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++)
        {
            max = nums[i];
            count = 0;
            for (int j = 0; j < nums.length; j++)
            {
                if (max > nums[j])
                    count++;
            }
            res[i] = count;
        }
        return res;

    }
}
