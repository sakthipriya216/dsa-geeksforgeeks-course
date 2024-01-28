/* 
Count the number of trailing zeros in a factorial.
5 and 2 together form 10 which gives us a zero.
Find the number of 5's from 1 to N 
n/5 is not the ans.
25 contains 2 5's.. but if we give n/5 only 1 five is added..
So, count the no of 5's by dividing n by powers of 5.
125 contains 3 5's..
*/

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int z = 0;
		for(int i=5; i<=n; i=i*5)
		{
		    z += (n/i);
		}
		
		System.out.println("The no of zeros are: "+z);
	}
}
