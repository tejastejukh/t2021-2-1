import java.util.Scanner;

public class Problem1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first number");
		double num1=scan.nextDouble();
		System.out.println("Enter a second number");
		double num2=scan.nextDouble();
		System.out.println("Enter 1 for addition, Enter 2 for Substraction,Enter 3 for multiplication,Enter 4 for division");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:System.out.println(num1+num2);
		break;
		case 2:System.out.println(num1-num2);
		break;
		case 3:System.out.println(num1*num2);
		break;
		case 4:System.out.println(num1/num2);
		break;
		default:System.out.println("Enter the Incorrect number");
		
		}
	}

}
