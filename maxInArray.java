public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {2,9,7,4,1,0,5,6};

        System.out.println(max(arr,0));
    }

    public static int max(int[] arr , int idx){

        if( idx == arr.length){
            return -1;
        }

        int pre = max(arr,idx+1);

        int max = Math.max(arr[idx],pre);

        return max;

    }
}
