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
	
}
