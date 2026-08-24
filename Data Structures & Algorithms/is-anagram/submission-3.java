class Solution {
    public boolean isAnagram(String s, String t) {
        int st = s.length();
        int tt = t.length();

        if (st != tt) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < st; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
    }
}