import java.util.Scanner;
import java.io.*;



public class Sumofdigits {
	
	public static int sum_of_digits(int num)
	{
		int remainder=0,sum=0;
		
		while(num>0)
		{
			remainder=num%10;
			sum=(sum)+remainder;
			num=num/10;
 
		}
//		System.out.println(sum);
		return(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		number=input.nextInt();
	 
		do
		{
		number=sum_of_digits(number);
		System.out.println(number);
		  
		}while(number/10 > 0);

	}

}
