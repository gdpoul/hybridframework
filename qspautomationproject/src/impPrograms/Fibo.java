package impPrograms;

public class Fibo {
	public static void main(String[] args) {
		
		int f0=0;
		int f1=1;
		System.out.print(f0+" "+f1+" ");
		for(int i=1;i<=10;i++)
		{
			int f=f0+f1;
			System.out.print(f+" ");
			f0=f1;
			f1=fn;
		}
	}

}
