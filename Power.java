public class Power {
    public static void main(String[] args) {
        int n = 2;
        int x = 3;

        int ans = powerLog(n, 8);

        System.out.println(ans);
    }

    public static int power(int n, int x) {
        if (x == 1) {
            return n;
        }
        int pre= power(n,x-1);
        int ans = n*pre;
        return ans ;
    }

    public static int powerLog(int n , int x){
        if(x==1)return n;

        int pre = powerLog(n, x/2);

        if(x%2==0){
            int ans = pre * pre;
          return ans;  
        }else{
            int ans = pre * pre * n;
            return ans;   
        }

    }
}
