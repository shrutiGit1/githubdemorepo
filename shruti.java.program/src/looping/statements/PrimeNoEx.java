package looping.statements;

import java.util.Scanner;

public class PrimeNoEx
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=sc.nextInt();
			boolean res=isPrime(n);
  if(res)
	   System.out.println("prime no");
  else
	   System.out.println(" not a prime number ");
}
public static boolean isPrime(int n)
{
	if(n<=1)
		return false ;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
			return false ;
	
	}
           return true ;

}
}
