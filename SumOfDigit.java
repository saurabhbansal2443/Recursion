public class SumOfDigit {
    public static void main(String[] args) {
        int n = 7;

        int ans = sumDigit(n);

        System.out.println(ans);

    }

    public static int sumDigit(int n){

        if(n>=0 && n<=9){
            return n;
        }
        int digit = n%10;
        int remSum = sumDigit(n/10);
        return digit + remSum;
    }
}
