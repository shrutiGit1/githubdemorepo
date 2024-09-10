package typecasting;

public class FloatNarrowing {
	public static void main(String[] args) {
		float x = 10.5f;
		float y = 20f;

		float z = x + y;
		System.out.println(z + " float formate ");
		
		int a=(int)z;
		System.out.println(a+" integer formate ");

	}
}
