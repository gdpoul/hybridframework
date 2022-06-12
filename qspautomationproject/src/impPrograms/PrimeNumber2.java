package impPrograms;

public class PrimeNumber2 {
	
	// Print 1-100 prime Number and count total
	
	public static void main(String[] args) 
	{
		int count=0;
		
		for(int n=1;n<=100;n++)
		{
			int r=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					r++;
				}
			}
			if(r==2)
			{
				System.out.print(n+" ");
				count++;
			}	
		}
		System.out.println("");
		System.out.println("Total Prime Number from 1-100 are "+count);
	}

}
