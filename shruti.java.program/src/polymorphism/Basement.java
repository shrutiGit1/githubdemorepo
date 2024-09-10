package polymorphism;

import java.util.Scanner;

public class Basement
{
	static int vc;
	static int tw;
	static int fw;
public static void main(String[] args)
{
	boolean input;
	Scanner sc=new Scanner(System.in);
do
{
	
	System.out.println("enter 1: to park the two wheeler ");
	System.out.println("enter 2: to park the four wheeler ");
	int n=sc.nextInt();
	if(n==1)
	{
		TwoWheeler t1=new TwoWheeler();
		adding(t1);
	}
	else if(n==2)
	{
		FourWheeler  f1=new FourWheeler();	
		adding(f1);		
	}
	else
	{
		System.out.println("invalid input");
	}
System.out.println("enter true if you want to repeat or else enter false to stop");
input=sc.nextBoolean();
}
while(input);
System.out.println("total no of vehical "+vc);
System.out.println("total no of twowheeler"+tw);
System.out.println("tota; no of fourwheeler"+fw);

if(tw>fw)	
{
System.out.println("two wheeler count is more ");
}
else if(fw<tw)
{
	System.out.println("four wheeler cout is more ");
}
else 
	System.out.println("count of both vehical is equal ");


}
public static void adding(Vehical ob) 
{
ob.parking();	

if(ob instanceof TwoWheeler)
{
	vc++;
	tw++;		
}
else if(ob instanceof FourWheeler)
{
	vc++;
	fw++;
}

}
}
