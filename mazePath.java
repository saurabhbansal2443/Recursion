import java.util.*;
public class mazePath {
    public static void main(String[] args) {
        ArrayList<String> ans=getPath(0, 0, 2, 2);
        System.out.println(ans);
    }

    public static ArrayList<String> getPath(int sr, int sc , int dr , int dc ){
        if( sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();

        if( sr<dr){
          vpath = getPath(sr+1, sc, dr, dc);
        }

        if(sc<dc){
            hpath = getPath(sr, sc+1, dr, dc);
        }

        ArrayList<String> ans= new ArrayList<>();

        for(String i : vpath){
            ans.add("v"+i);
        }

        for(String i : hpath){
            ans.add("h"+i);
        }

        return ans ;
    }
}
