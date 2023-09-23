// writw a program of factorization of 100 using both brute-force and optimization

/*
// 1. using optimization method-1
import java.util.*;
class Factorization {
	static int count = 0;
	static int itr = 0;
	static int findFactor(int num){
		for(int i=1;i<=num/2;i++){ //in this also doing optimization but not very perfect still runs loop in 41 times unnecessary so next
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
/*
// 2. using optimization
import java.util.*;
import java.math.*;  //we cannot use this in loop so neglect it...

class Factorization {
        static int count = 0;
        static int itr = 0;
       
        static int findFactor(int num){
                for(int i=1;i*i<=num;i++){
			itr++;
                        if(num%i==0){
                                if(i==num/i){
					count = count +1;
				}
				else{
					count = count+2;
				}
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
// 3. Optimization technique-3 logic 2nd
import java.util.*;
import java.math.*;  //we cannot use this in loop so neglect it...

class Factorization {
        static int count = 0;
        static int itr = 0;

        static int findFactor(int num){
                for(int i=1;i*i<=num;i++){
                        itr++;
                        if(num%i==0){
                                count = count+2;
                        }
                }
                return count-1;

        }

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int ans = findFactor(num);
                System.out.println("count is:"+ ans);
                System.out.println("Iterations are:"+itr);
        }
}
