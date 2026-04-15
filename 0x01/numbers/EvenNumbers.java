public class EvenNumbers {
	public static void main(String[] args) {
		int number = 0;

		while (number < 100)
		{
			if (number % 2 == 0) {
				if (number < 98)
					System.out.print(number + ", ");
				else
					System.out.print(number + "\n");
			}
			number++;
		}
	}
}
