import java.util.Scanner;

public class Problem3 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int ab=scan.nextInt();
		if(ab==1&&ab==2)
		{
			System.out.print("1");
		}
		else
		{
			System.out.print("1");
		if(ab%2==0)
				ab--;
		
		for(int m=3;m<=2*ab;m++)
		{
			if(m%2!=0)
			{
				System.out.print(","+m);
			}
		}
		}
		
	}

}
