// write a program of perfectsquare of 100 using both brute-force and optimization

// 1. Brute-Force Approach
/*
class SquareRoot{

	static int itr = 0;	
	static int sqrt(int num){
		int val = 0;

		for(int i=1;i<=num;i++){
			itr++;
			if(i*i==num){
				val = i;
			}
		}
		return val;
		
	}
	public static void main(String[] args){

		int ans = sqrt(100);
		System.out.println(ans);//10
		System.out.println(itr);//100
	
	}
}



// 2.Optimization-I
class SquareRoot{

        static int itr = 0;
        static int sqrt(int num){
                int val = 0;

                for(int i=1;i<=num;i++){
                        itr++;
                        if(i*i<=num){
                                val = i;
                        }else{
				break;
			}
                }
                return val;

        }
        public static void main(String[] args){

                int ans = sqrt(81);
                System.out.println(ans);//9
                System.out.println(itr);//10

        }
}


// 3 . Optimization-2

class SquareRoot{

        static int itr = 0;
        static int sqrt(int num){
                int val = 0;

                for(int i=1;i*i<=num;i++){
                        itr++;
                        if(i*i==num){
                                val = i;
                        }
                }
                return val;

        }
        public static void main(String[] args){

                int ans = sqrt(77);
                System.out.println(ans);//9
                System.out.println(itr);//9

        }
}
*/
// Now in above all code it not gives square root for not perfectsquare so use another logic
// 4. Optimization-3
class SquareRoot {

	static int sqrt(int num){
		int start = 1;
		int end = num;
		int ans = 0;
		int itr = 0;

		while(start<=end){
			itr++;
			int mid = (start+end)/2;
			int sqr = mid*mid;
			if(sqr==num){
				System.out.println(itr);
				return mid;
			}
			else if(sqr>num){
				end = mid - 1;
			}
			else {
				ans = mid;
				start = mid+1;
			}
		}

		System.out.println(itr);
		return ans;
	}
	public static void main (String[] args){

		int num = 50;
		int ret = sqrt(num);
		System.out.println(ret);
		}
}






























