
class Solution {

	public static void main(String[] args){

		int arr[] = new int[]{0,1,0,3,12};
		int arr2[] = new int[arr.length];

		
		System.out.println(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	
		
		int index = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr2[index] = arr[i];
				index++;
			}
						

		}
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
	}
}

