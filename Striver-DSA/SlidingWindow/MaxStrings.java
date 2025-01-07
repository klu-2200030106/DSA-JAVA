package SlidingWindow;

public class MaxStrings {
    //Length of longest substring without any repeating characters
    public static void main(String[] args) {
        String s = "abcdabcbb";
        System.out.println(maxString(s));
    }
    public static int maxString(String s) {
        int start = 0, maxLen = 0, charIdx = 0;
        int[] idx = new int[128];
        for (int i = 0; i < s.length(); i++) {
            charIdx = s.charAt(i);
            start = Math.max(start, idx[charIdx]);
            maxLen = Math.max(maxLen, i - start + 1);
            idx[charIdx] = i + 1;
        }
        return maxLen;  
        }
}
