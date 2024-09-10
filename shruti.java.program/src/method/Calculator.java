package method;

public class Calculator 
{
public static void main(String[] args) {
	Calculator.convert('a','b');
}
public static void convert(int a,int b)
{
	System.out.println(Calculator.add(a,b)+" total output");
}
public static int add(int x,int y)
{
	return x+y;
	}
}
