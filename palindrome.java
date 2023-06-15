public class palindrome {
    public static void main(String[] args) {
        String str = "abcddcba";

        boolean ans =checkPalindrome(str, 0, str.length()-1);
        System.out.println(ans);
        
    }

    public static boolean checkPalindrome(String str ,int st , int end){
        if( st>end) return true;
        else if (str.charAt(st)!=str.charAt(end)) return false;

        boolean ans =checkPalindrome(str, st+1, end-1);
        return ans ;

    }
}
