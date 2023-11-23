package week1.day2.assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = inpt.nextInt();
		int sum=0,rem;
		int temp;
		temp = num;
		while(num > 0 )
		{
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(temp == sum)
		{
			System.out.println("The Given number "+ temp +" is a Palindrome");
		}
		else
		{
			System.out.println("The Given number "+ temp +" is not a Palindrome");
		}
			}

}
