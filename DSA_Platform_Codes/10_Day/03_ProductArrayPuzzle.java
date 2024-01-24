class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) {
	    
	    long arr[] = new long[n];
	    for(int i=0;i<nums.length;i++) {
	        long product = 1;
	        for(int j=0;j<nums.length;j++){
	            if(i==j){
	                continue;
	            }
	            else{
	                product = product*nums[j];
	            }
	            
	        }
	        arr[i]=product;
	        
	    }
	    return arr;
        
	} 
} 
