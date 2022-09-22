package studio3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Give a number: ");
		int n = in.nextInt();
		
		boolean[] prime = new boolean[n+1];
		for(int i =0;i<prime.length;i++) {
			prime[i]=true;
		}
		
		
		for (int i = 2; (i*i) <= (n); i++)
		{
			if (prime[i] == true)
			{
				for(int j = (i*i); j <= n; j += i)
				{
					prime[j] = false;
					System.out.println(j);
				}
			}
		}
		
		for (int i = 2; i <=n; i++)
		{
			if (prime[i] == true);
			{
				System.out.println(i-2 + " is a prime number.");
			}
		}
		
		
//		for (int i = 2; i <= n; i++)
//		{
//			System.out.print(i + ", " + prime[i] + ", ");
//			for (int m = 2; (m*n) < n; m++)
//			{
//				int mult = n * m;
//				System.out.print(mult + ", ");
//				prime[mult] = false;
//				System.out.println(prime[mult]);
//			}
//		}
		
	}

}
