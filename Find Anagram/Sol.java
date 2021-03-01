class Solution {
    public int[] anagramMappings(int[] A, int[] B)
    {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < B.length; j++)
            {
                if (A[i] == B[j])
                {
                    res[i] = j;
                }
            }
        }
        return res;
    }
}
