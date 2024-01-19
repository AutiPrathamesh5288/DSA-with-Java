class Solution {

	public static void main(String[] args) {

		int arr[] = new int[]{1,5,3,4,3,5,6};
		boolean flag = false;
		

		for(int i = 0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j]){

					flag = true;
					
				}
			}
		}
				if(flag=true){
					System.out.println(i);
					return;
				}else{
					System.out.println("-1");
					return;
				}
			
			}
			
		}

	}
}

					
