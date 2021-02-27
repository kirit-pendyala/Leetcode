class Solution {
    public int largestAltitude(int[] gain)
    {
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i = 0; i < gain.length; i++)
        {
            sum += gain[i];
            res.add(sum);
            sum = res.get(i + 1);
        }
        return (Collections.max(res));
    }
}
