class Solution {
    public int subtractProductAndSum(int n)
    {
        int sDigit = 0, pDigit = 1, r = 0;
        while (n > 0)
        {
            r = n % 10;
            pDigit *= r;
            sDigit += r;
            n /= 10;
        }
        return (pDigit - sDigit);
    }
}
