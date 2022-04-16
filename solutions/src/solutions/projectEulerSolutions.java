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
	
}
