public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,8,3,4,5,6,8,7,9};
        int k=8;

        int ans = find(arr, arr.length-1, k);

        System.out.println(ans);

    }

    public static int find(int[] arr , int idx , int k){

        if(idx==-1){
            return -1;
        }else if (arr[idx]==k){
            return idx;
        }

        return find(arr,idx-1,k);

    }
}
