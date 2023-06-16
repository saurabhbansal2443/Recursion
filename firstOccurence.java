public class firstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,4,5,8,6,8,7};
        int k=8;

        int ans = find(arr, 0, k);

        System.out.println(ans);

    }

    public static int find(int[] arr , int idx , int k){

        if(idx==arr.length){
            return -1;
        }else if (arr[idx]==k){
            return idx;
        }

        return find(arr,idx+1,k);

    }
}
