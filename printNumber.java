public class printNumber{
    public static void main(String[] args) {
        int n = 10 ;

        printTillN(n);

        
    }

   

    public static void printTillN(int n){
        if(n<1){
            return;
        }

        System.out.println(n);

        printTillN(n-1);

        System.out.println(n);
    }
}