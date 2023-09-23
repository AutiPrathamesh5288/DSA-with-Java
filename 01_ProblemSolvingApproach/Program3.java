// write a program of perfectsquare of 100 using both brute-force and optimization

// 1.Brute Force Approach

class SquareRoot {
	

	static int findSquareRoot(int num){

		for(int i=1;i<=num;i++){
			if(i*i==num){
				return i;
			}
		}
		return 1;
	}
	public static void main(String[] args){

		int ans = findSquareRoot(89);
		if(ans==1){
			System.out.println("It is not a perfect square of any number");
		}else{
			System.out.println(ans);
		}
	}
}

//in this code it is excption for number 1 so not proper way to write this code
