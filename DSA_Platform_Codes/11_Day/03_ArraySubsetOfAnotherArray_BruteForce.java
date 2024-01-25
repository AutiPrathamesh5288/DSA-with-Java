import java.util.*; 
class Compute { 
	public static String isSubset( long a1[], long a2[], long n, long m) { 
		Arrays.sort(a1); 
		Arrays.sort(a2); 
		int count =0; 
		for(int i=0;i<a2.length;i++){ 
			for(int j=i;j<a1.length;j++){ 
				if(a2[i]==a1[j]){ 
					count++; 
					break; 
				} 
			} 
		} 
		if(count == a2.length){ 
			return "Yes"; 
		} 
		return "No"; 
	} 
	public static void main(String[] args) { 
		long nums1[] = new long[]{10,5,2,23,19}; 
		long n = 5; long m = 3; 
		long nums2[] = new long[]{19,5,3}; 
		String ans = isSubset(nums1,nums2,n,m); 
		
		System.out.print(ans); 
	} 
}
