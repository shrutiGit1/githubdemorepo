package inheritancer;

public class student extends Employee
{
int sid;

public student(int sid,int eid,String name ,int id)
{
	super(eid,name ,id );
	this.sid=sid;
	
}
public void s()
{
	System.out.println(sid );
}
}
