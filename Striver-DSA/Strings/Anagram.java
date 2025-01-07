package Strings;
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
// explain code
// 1. We first check if the two strings have the same length. If they don't,
//    we can immediately return false because anagrams must have the same number of characters.
// 2. We create an array of size 256 to keep track of the frequency of each
//    character in the two strings. We iterate through the two strings and increment the count
//    of the character in the array for the first string, and decrement the count for the second
//    string. This way, if a character appears an odd number of times in the two strings
//    (e.g., 3 times in the first string and 2 times in the second string), the count for that
//    character in the array will be non-zero at the end of the iteration.
// 3. Finally, we iterate through the array and check if all the counts are zero. If they are,
//    it means that the two strings are anagrams of each other, and we return true. Otherwise,
//    we return false.
// 4. The time complexity of this solution is O(n), where n is the length of the strings,
//    because we are iterating through the strings once. The space complexity is O(1) becaus
//    we are using a fixed-size array of size 256 to keep track of the character frequencies.
//    This is an optimal solution for this problem. We can also use a HashMap to solve this
//    problem, but that would take O(n) space, which is not optimal. Therefore, this solution
//    is the best approach for checking if two strings are anagrams of each other.
//  https://www.youtube.com/watch?v=3MwRGPPB4tw