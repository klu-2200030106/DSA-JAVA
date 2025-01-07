public class Anagram
{
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "sileng";
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] count = new int[256];
        for(int i=0; i<s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0; i<256; i++) {
            if(count[i] != 0) return false;
        }
        return true;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
// n = length of the string
// This is the optimal solution for this problem.
// We can also use HashMap to solve this problem but that will take O(n) space.
// So, this is the optimal solution.
// This code is contributed by Striver
// https://www.youtube.com/watch?v=3MwRGPPB4tw