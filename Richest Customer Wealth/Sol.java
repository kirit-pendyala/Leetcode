class Solution {
    public int maximumWealth(int[][] accounts)
    {
        int res = 0, sum = 0;
        for (int i = 0; i < accounts.length; i++)
        {
            sum = 0;
            for (int j = 0; j < accounts[0].length; j++)
            {
                sum += accounts[i][j];
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
