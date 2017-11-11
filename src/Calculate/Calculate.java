package Calculate;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int x, y;
		String operator;
		while (true) {
			System.out.println("연산할 두 값을 입력하시오.");
			x = input.nextInt();
			y = input.nextInt();
			System.out.println("연산할 연산자를 입력하시오. (+, -, *, /)");
			operator = input.next();
			if (operator.equals("+")) {
				System.out.println(x + " + " + y + " = " + add(x, y));
			} else if (operator.equals("-")) {
				System.out.println(x + " - " + y + " = " + sub(x, y));
			} else if (operator.equals("*")) {
				System.out.println(x + " * " + y + " = " + mul(x, y));
			} else if (operator.equals("/")) {
				System.out.println(x + " / " + y + " = " + div(x, y));
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	public static int add(int x, int y) {

		return 0;
	}

	public static int sub(int x, int y) {

		return 0;
	}

	public static int mul(int x, int y) {

		return 0;
	}

	public static double div(int x, int y) {
		// 실수로 반환이 되도록 구현

		return 0;
	}
}
