package ujjwaln;
import java.util.Scanner;
import java.math.*;


public class overloading {
	int sum;
	
	int sums(int a,int b)
	{
		sum=(int) Math.pow(a+b,2);
		return sum;
	}
	
	int sums(int a,int b,int c)
	{
		sum=(int) Math.pow(a+b+c,2);
		return sum;
	}
	
	
	
	
	
	
	

	public static void main(String[] args) 
	{
		overloading a=new overloading();
		System.out.println(a.sums(3,4));
		System.out.println(a.sums(3,4,4));
		

	}

}

