public class Number {
	public static void todivide(int a, int b) {
		int number_divided = 0;
		try {
			number_divided = a / b;
		} catch (Exception e) {
			System.out.println("It is not possible to divide by zero.");
		}
		finally {
			System.out.format("%d / %d = %d\n", a, b, number_divided);
		}
	}
}
