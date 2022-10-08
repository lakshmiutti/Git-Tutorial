package pdf;

import java.util.Scanner;

// 24. Develop a program to print prime numbers between two given numbers?
public class A24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		System.out.println("prime numbers between " + num1 + " and " + num2 + " are ");
		while(num1 <= num2)
		{
			boolean isPrime = true;
			for(int i = 2; i <= (num1 / 2); i++)
			{
				if((num1 % i) == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(num1 + ", ");
			}
			num1++;
		}
	}
}
