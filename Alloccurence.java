public class Alloccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,8,4,5,6,7,8};
        int k=8;

        find(arr, 0, k);

        

    }

    public static void find(int[] arr , int idx , int k){

        if(idx==arr.length){
            return ;
        }else if (arr[idx]==k){
            System.out.println(idx);
        }

        find(arr,idx+1,k);

    }
}
