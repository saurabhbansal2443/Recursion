public class factorial {
    public static void main(String[] args) {
        int n=5 ;
     
        int ans = fact(5);
        
        System.out.println(ans);

    }

    public static int fact(int n){
        if(n<1){
            return 1;
        }
       
        int preFact = fact(n-1);
        System.out.println(n+ "    prefact " + preFact);
        return n * preFact;
    }
}
