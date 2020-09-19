package ujjwaln;

public class sort {

	public static void main(String[] args) 
	{
		int temp;

		int arr[]= {55,62,3,84,15};
		for(int i=0;i<5;i++)
			for(int j=1;j<5-i;j++)
				if(arr[j-1]>=arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;	
				}
					
		
		for(int g=0;g<5;g++)
			System.out.println(arr[g]);
		
		
					


	}

}
