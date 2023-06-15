public class printPermutation {
    public static void main(String[] args) {

        String str = "abc";

        pp(str, "");
        
    }

    public static void pp(String str,String ans ){
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }


        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i+1);

            pp(rem,ans+ch);

        }


    }
}
