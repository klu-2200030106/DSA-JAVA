public class longestcommonprefix {
    // give code
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }
    // remaning code
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String ans = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            int j=0;
            while(j<ans.length() && j<strs[i].length() && ans.charAt(j) == strs[i].charAt(j))
            {
                j++;
            }
            ans = ans.substring(0,j);
        }
        return ans;
    }
}
