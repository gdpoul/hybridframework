package impPrograms;

public class ReverseString {
	public static void main(String[] args) {
		
		String s="India Is My Country";
		
		String[] s1=s.split(" ");
		
		for(int i=0;i<=s1.length-1;i++)
		{
		     String a= s1[i];
		     System.out.print(" " );
		     for(int j=a.length()-1; j>=0; j--) {
		    	 System.out.print(a.charAt(j));
		     }
		}		
	}

}
