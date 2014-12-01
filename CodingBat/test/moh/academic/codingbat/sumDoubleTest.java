package moh.academic.codingbat;

public class sumDoubleTest {
	private sumDouble targetSumDouble;
	private Object c;
	private int errors;
	private int count;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sumDoubleTest app = new sumDoubleTest();
	}
	
	
	public void sumDoubleTest(){
		targetSumDouble = new sumDouble();
		sumDoubleTestCases();
		
	}
	
	public void sumDoubleTest(int a, int b , int expected) {
		int actual =0;
		
		try {
			actual = targetSumDouble.sumDouble(a, b);
			System.out.println(actual);
		} catch (Exception e) {
            System.out.println( actual);
			e.printStackTrace();
		}
		
		if (actual != expected){
			System.out.println("For expected" + expected + " returned  "+ actual );
			errors++;
		}
		count++;
	}
	
	
	public void sumDoubleTestCases(){
		sumDoubleTest(1,2,3);
		sumDoubleTest(2,2,8);
		sumDoubleTest(2,3,5);

	}


}
