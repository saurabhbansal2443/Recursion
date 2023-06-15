public class reverseString {
    public static void main(String[] args) {
        String str = "abcdef";

        System.out.println(rev(str, str.length()-1));

    }

    public static String rev(String str,int idx ){
        if(idx==-1){
            return "";
        }

        char ch = str.charAt(idx);

        String rem = rev(str,idx-1);

        String ans=ch+rem;
        
        return ans;
    }
}
