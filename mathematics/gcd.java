
//GCD OF 2 NUMBERS..

import java.util.*;
public class Main
{
    public static int gcd_sub(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        
        return a;
    }
    
    public static int gcd_mod(int a, int b)
    {
        if(b==0)
            return a;
        
        // 1st parameter is always greater than 2nd parameter..
        // if 1st parameter is lesser than 2nd parameter then this function call is just gonna swap both the variables.
        return gcd_mod(b, a%b);
        
    }
    
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers to find their gcd: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res1 = gcd_sub(a,b);
		int res2 = gcd_mod(a,b);
		
		System.out.println("Result using gcd_sub(): "+res1);
		System.out.println("Result using gcd_mod(): "+res2);
	}
}
