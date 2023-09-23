// writw a program of factorization of 10 using both brute-force and optimization

/*
// 1. using brute force
import java.util.*;
class Factorization {
	static int count = 0;
	static int itr = 0;
	static int findFactor(int num){
		for(int i=1;i<=num;i++){
			itr++;
			if(num%i==0){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = findFactor(num);
		System.out.println("count is:"+ ans);
		System.out.println("Iterations are:"+itr);
	}
}
*/
// 2. using optimization
import java.util.*;
class Factorization {
        static int count = 0;
        static int itr = 0;
       
        static int findFactor(int num){
                for(int i=1;i<=num/2;i++){
			itr++;
                        if(num%i==0){
                                count++;
                        }
                }
                return count+1;
               
        }

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int ans = findFactor(num); 
		System.out.println("count is:"+ ans);
		System.out.println("Iterations are:"+itr);
        }
}


