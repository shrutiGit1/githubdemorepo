package polymorphism;

public class Rapido 
{
// method overriding means 	 runtime binding 
// creating a class with same method signature(i.e.same method name with same method  formal argument )a non static method in parent as well as in child 
//	but with different method implementation is called as method overrridding and binding depends on runtime object 
//	child should have same or higher accessibility then parent
public void ride()
{
	System.out.println("ride from rapido ");
}
}
