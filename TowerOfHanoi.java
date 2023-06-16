public class TowerOfHanoi {
    public static void main(String[] args) {

        print(3,'s','d','h');
        
    }


    public static void print(int n , char src, char dest,char helper){
      if(n==1){
        System.out.println(n + "[ " + src + " => " + dest +" ]");
        return;
      }

      print(n-1,src,helper,dest);
      System.out.println(n + "[ " + src + " => " + dest +" ]");
      print(n-1,helper,dest,src);


    }
}
