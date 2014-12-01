package moh.academic.codingbat;

public class diff21Test {

	private diff21 targetdiff21;
	private int errors = 0;
	private int count = 0;

	public static void main(String[] args) {
		diff21Test app = new diff21Test();
	}

	public diff21Test() {
		targetdiff21 = new diff21();
		diff21TestCases();
	}

	public void diff21Test(int n, int expected) {
		int actual = 0;

		try {
			actual = targetdiff21.diff21(n);
			System.out.println("Called with value " + n);
		} catch (Exception e) {
			System.out.println("for expected " + expected + " system returned " + actual);
			e.printStackTrace();

		}

		if (actual != expected) {
			System.out.println("for expected " + expected + " got value " + actual);
			errors++;
		}
		count++;
	}

	public void diff21TestCases() {
		diff21Test(19, 2);
		diff21Test(10, 11);
		diff21Test(21, 0);
		System.out.println("Called: " + count + "  errors: " + errors);
	}

}
