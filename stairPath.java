import java.util.*;
public class stairPath {
    public static void main(String[] args) {
       int n=4;
        ArrayList<String> ans = getPath( n);

        System.out.println(ans);
    }

    public static ArrayList<String> getPath(int n){

        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if ( n<0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> path1=getPath(n-1);
        ArrayList<String> path2=getPath(n-2);
        ArrayList<String> path3=getPath(n-3);

        ArrayList<String> res =new ArrayList<>();
        for(String s:path1){
            res.add(1+s);
        }
        for(String s:path2){
            res.add(2+s);
        }
        for(String s:path3){
            res.add(3+s);
        }
        return res;    
    }
}
