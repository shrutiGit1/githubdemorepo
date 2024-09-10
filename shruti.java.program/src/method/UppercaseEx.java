package method;

public class UppercaseEx 
{
public static void main(String[] args) {
	char c='@';
	if(c>='A'&&c<='Z')
		System.out.println("upper case ");
	else if(c>='a'&&c<='z')
		System.out.println("lower case ");
	else 
		System.out.println("not an alphabet");
}
}
