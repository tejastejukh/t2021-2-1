import java.util.Scanner;

public class Problem2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int value=scan.nextInt();
		if(value==1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.print("1");
			for(int i=3;i<=2*value;i++)
			{
				if(i%2!=0)
				{
					System.out.print(","+i);
				}
			}
		}
		
	}

}
