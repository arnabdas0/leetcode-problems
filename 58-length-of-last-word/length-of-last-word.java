class Solution {
    public int lengthOfLastWord(String s) {
        String a[] = s.split(" ");
        return a[a.length-1].length();
    }
}