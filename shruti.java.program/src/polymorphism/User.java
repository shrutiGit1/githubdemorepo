package polymorphism;

public class User 
{
public static void main(String[] args) 
{
Bike b=new Bike();
books(b);
}
//upcasting receiveing child object into parent object is nothing but upcasting 
// upcasting implicitly performed by compiler 
public static void books(Rapido ob)
{
ob.ride();
// downcasting performed by PROGRAMMMER explicitly 
// downcasting is performed by using an operator called as instaceof 
//typecasting AN OBJECT INTO AN APPROPIATE CLASS TYPE THEN WE WILL GET CLASS CAST EXCEPTION
//instanceof is a keyword which validate whether the object belong to particular class or not and produces the boolean output if it belong to that class then boolean truew and if not then false

if(ob instanceof Bike)
{
	Bike b1=(Bike)ob;
	b1.costb();
}
else if(ob instanceof Auto)
{
	Auto a1=(Auto)ob;
	a1.costA();
}
else 
	System.out.println("inappropiate class type ");
}
}
