import java.util.Scanner;

public class Problem4 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of Elements in Array");
		int a=scan.nextInt();
		int arr []=new int[a];
		System.out.println("Enter a Array Elements");
		for(int s=0;s<a;s++)
		{
			arr[s]=scan.nextInt();
		}
		System.out.print(1+":"+a);
		for(int s=2;s<=9;s++)
		{
			for(int t=0;t<a;t++)
			{
				if(arr[t]%s==0)
				{
					count++;
				}
			}
			System.out.print(","+s+":"+count);
			count=0;
		}
	}

}
