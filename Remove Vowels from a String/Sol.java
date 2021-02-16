class Solution {
    public String removeVowels(String s)
    {
        s = s.replaceAll("([a,e,i,o,u])","");
        return s;
    }
}
