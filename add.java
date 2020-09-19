package ujjwaln;

public class add 
{

	public static void main(String[] args) 
	{
		
		int a[][]= {{1,2,3},{1,3,4}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		
		System.out.println();
		int b[][]= {{3,6,4},{9,3,7}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
		System.out.println();
		}
		int c[][]=new int[2][3];
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++)
				c[i][j]=a[i][j]+b[i][j];
		
		
		System.out.println();
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
		System.out.println();
		}
	
	}	


}