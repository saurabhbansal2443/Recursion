public class fibonnaci {
    public static void main(String[] args) {
        int n=7 ;

        int ans= fib(n);

        System.out.println(ans);
    }

    public static int fib(int n){

        if(n==1) return 0;
        else if(n==2) return 1;
        
        int n1 =fib(n-1) ;
        int n2 = fib(n-2);

        int ans = n1 + n2;
        return ans ;

    }
}
