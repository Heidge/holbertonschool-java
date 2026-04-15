public class Numbers0to99 {
	public static void main(String[] args) {
		int number = 0;
		while (number < 100)
		{
			if (number < 99)
				System.out.print(number + ", ");
			else
				System.out.print(number + "\n");

			number++;
		}
	}
}
