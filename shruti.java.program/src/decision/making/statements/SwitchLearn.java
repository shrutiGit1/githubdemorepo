package decision.making.statements;

public class SwitchLearn {
	public static void main(String[] args) {
		int n = 9;
		int m = 2;
		switch ('*') {
		case ('+'):
			System.out.println(m + n);
			break;
		case ('-'):
			System.out.println(m - n);
			break;
		case ('*'):
			System.out.println(m * n);
			break;
		default:
			System.out.println("correct operator is not present ");
			break;
		}

	}
}
