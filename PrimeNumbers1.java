public class PrimeNumbers1 {

	public static void main(String[] args) {
		checkPrimeNumber(11);
		printPrimeNumber(100);
	}

	// method to check prime number or not
	public static void checkPrimeNumber(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " Not a Prime Number");

		}

	}

	// method to print prime numbers

	public static void printPrimeNumber(int mnum) {

		for (int i = 1; i <= mnum; i++) {
			int mcount = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					mcount++;
				}

			}
			if (mcount == 2) {
				System.out.println(i);
			}

		}

	}
}