import java.util.*;
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here

       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       for(int i = 0; i < n;i++){
           Integer j = hm.get(arr[i]);
           hm.put(arr[i],(j == null)?1:j+1);
       }
       int res = 0;
       for(int i = 0; i < n;i++){
           if(arr[i] == k-arr[i]){
               res = res+(hm.get(arr[i])-1);
           }else{
               Integer j = hm.get(k-arr[i]);

               if(j != null){
                   res = res + j;
               }
           }
       }
       res = res/2;

       return res;
    }

}

class Client{
	public static void main(String[] args){

		Solution obj = new Solution();
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int sum = sc.nextInt();

		int arr[] = new int[size];
		for(int i = 0; i < size;i++){

			arr[i] = sc.nextInt();
		}

		int ret = obj.getPairsCount(arr,size,sum);

		System.out.println(ret);
	}
	
}



