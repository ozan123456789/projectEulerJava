package solutions;

import java.util.ArrayList;

public class projectEulerSolutions {

	//private static ArrayList<Integer> numbers=new ArrayList<Integer>();
	/*
	public static int problem1(int limit,String... s) 
	{
		for(String i:s) {
			numbers.add(Integer.parseInt(i));
		}
		
		return 0;
	}
	*/
	public static int problem1() {
		
		int sum=0;
		
		for(int i=3;i<1000;i++) 
		{
		if(i%3==0 || i%5==0) {
			sum+=i;
		}
		}
		
		return sum;
	}
	public static int problem2() {
		int sum=2;
		
		int first=1,second=2;
		int third=first+second;
		
		while(third<4000000) {
			if(third%2==0) {
				sum+=third;
			}
			
			first=second;
			second=third;
			third=first+second;
			
			
		}
		
		
		return sum;
	}
	
	private static ArrayList<Long> prime_factors =new ArrayList<Long>();
	public static int problem3() {
		long number=600851475143L;
		 for(long i = 2L; i< number; i++) {
	         while(number%i == 0) {
	            //System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	    	  //System.out.println(number);
	         prime_factors.add(number);
	      }
		return (int)number;
		
	}
	
	public static long problem6() {
		int limit=100;
		
		long sum1=0;
		double sum2=0;
		long output;
		
		for(int i=1;i<=limit;i++) {
			sum1+=Math.pow(i,2);
			sum2+=i;
		}
		//System.out.println(sum1+"a"+sum2);
		//sum2=(limit*(limit+1))/2;
		sum2=Math.pow(sum2,2);
		output=(long) Math.abs(sum1-sum2);
		
		return output;
		
	}
	
	
}
