class Solution {

      static boolean hasArrayTwoCandidates(int arr[],int n,int x) {

		boolean flag = false;
		int sum = 0;
		for(int i=0;i<arr.length-1;i++) {

			for(int j=i+1;j<arr.length;j++) {

				sum = arr[i]+arr[j];
				if(sum == x){
					flag = true;
				}

			}
		}
		return flag;
	}
	public static void main(String[] args){
		int n = 6;
		int arr[] = new int[]{1,2,4,3,6};
		int x = 10;

		boolean answer = hasArrayTwoCandidates(arr,n,x);
		System.out.println(answer);
	}
}


