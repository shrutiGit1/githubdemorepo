package method;

public class UppertoLower 
{
public static void main(String[] args) {
	char c='a';
	
	if(c>='A'&&c<='Z')
		System.out.println(c);
	else if(c>='a'&&c<='z') {
		  int x=c-32;
		  char y=(char)x;
		System.out.println(y);	
	}
	else
		System.out.println("not an aplhabet");
		
}
}
