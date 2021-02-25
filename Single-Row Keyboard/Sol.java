class Solution {
    public int calculateTime(String keyboard, String word)
    {
        int sumTime = 0, index = 0, currentIndex = 0, diff = 0;
        for (int i = 0; i < word.length(); i++)
        {
            currentIndex = keyboard.indexOf(word.charAt(i));
            diff = Math.abs(currentIndex - index);
            index = currentIndex;
            sumTime += diff;
        }
        return sumTime;
    }
}
