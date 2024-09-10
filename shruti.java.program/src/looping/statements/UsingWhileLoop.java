package looping.statements;

public class UsingWhileLoop {
	public static void main(String[] args) {
		int sum = 0;
		int i = 10;
		while (i <= 20) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println(i);

//		sum of even numbers
			}

			i++;
		}
		System.out.println(sum);
	}
}
