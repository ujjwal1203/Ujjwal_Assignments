package ujjwaln;

public class avg {

	public static void main(String[] args)
	{
		
		int arr[]= {1,2,3,4,5};
		int sum=0;
		
		for(int i=0;i<5;i++)
			sum=sum+arr[i];
		float avg=sum/5;
		System.out.println("sum= "+sum+"  average= "+avg);
			
	}

}
