package Lab9;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Lab9 {

	public static void main(String args[])
	{
		int num1, num2, num3, num4;
		num1 = AcceptInput();
		System.out.println("The sum of numbers from 1 to " + num1 + " is: " + RecursiveSum(num1)); 
		num2 = AcceptInput();
		System.out.println("The sum of numbers from 1 to " + num2 + " is: " + RecursiveSum(num2));
		num3 = AcceptInput();
		System.out.println("The sum of numbers from 1 to " + num3 + " is: " + RecursiveSum(num3));
		num4 = AcceptInput();
		System.out.println("The sum of numbers from 1 to " + num4 + " is: " + RecursiveSum(num4));
}

public static int AcceptInput()
{
	Scanner input = new Scanner(System.in);
	int num = 0;

	System.out.println("Input Integer: ");
	do
	{
		try
		{
			
			num = input.nextInt();
		
		}
		catch(InputMismatchException e)
		{
			System.out.print("Error : Something went wrong!" + "\n");
		}
	
	}
	while (num != (int)num);
	return num;

}

public static int RecursiveSum(int n)
{
	if( n==1 )
	{
		return 1;
	}
	else if(n < 1)
	{
		return n + RecursiveSum(n+1);
	}
	else if (n > 1)
	{
		return n + RecursiveSum(n-1);
	}
	else
	{
		return 0;
	}
}


}