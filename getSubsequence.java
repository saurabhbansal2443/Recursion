import java.util.ArrayList;

public class getSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> res = subsequence(str);
        System.out.println(res);
    }

    public static ArrayList<String> subsequence(String str) {

        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);

        ArrayList<String> rres = subsequence(rem);

        ArrayList<String> ans = new ArrayList<>();

        // for (String s : rres) {

        //     ans.add(s);
        //     ans.add(ch + s);
        // }

        for(int i=0;i<rres.size();i++){
            String s=rres.get(i);

            ans.add(s);
            ans.add(ch+s);
        }

        return ans;

    }
}
