package inheritancer;

public class Employee extends Person
{
int  eid;

public Employee(int eid,String name ,int id  )
{
	super(name, id);
this.eid=eid;

}
public void e()
{
	System.out.println(eid );
}

}
