// give code
// code
public class Reverse
{
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        while(n>0)
        {
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}

// output


// 54321
// Time Complexity: O(log10(n))
// Space Complexity: O(1)
// Approach: Keep dividing the number by 10 and keep adding the remainder to the answer after multiplying it by 10.
// Path: Striver-DSA/Reverse.java
// give code
