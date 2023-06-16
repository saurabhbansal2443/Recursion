public class countoccurence{
    public static void main(String[] args) {
        int[] arr = {2,3,52,2,45,1,2,2,6};

        int k=2;

        int ans = find(arr, k, 0);

        System.out.println(ans);

    }

    public static int find(int[] arr , int k , int idx){

        if(idx==arr.length){
            return 0;
        }else if(arr[idx]==k){
            int res = 1+ find(arr,k,idx+1);
            return res;
        }

 
        return find(arr, k, idx+1);


    }
}