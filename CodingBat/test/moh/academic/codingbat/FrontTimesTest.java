package moh.academic.codingbat;

public class FrontTimesTest {
	private FrontTimes targetFrontTimes;
	private int errors=0;
	private int count=0;

	public static void main(String[] args) {
		FrontTimesTest app = new FrontTimesTest();
	}

	public FrontTimesTest(){
		targetFrontTimes = new FrontTimes();
		FrontTimesTestCases();
	}

	public void FrontTimesTest(String str, int n , String expected) {
		String actual = null;
		
		try {
			actual = targetFrontTimes.FrontTimes(str, n );
			System.out.println("Called :  " + str + " With :" +n );
		} catch (Exception e) {
            System.out.println( "expected" + expected + "returned " + actual);
			e.printStackTrace();
		}
		
		if (!actual.equals(expected) ){
			System.out.println("For expected  " + expected+ "   returned " + actual);
			errors++;
		}
		count++;
	}
	
	public void FrontTimesTestCases(){
		FrontTimesTest("Chocolate", 2, "ChoCho");
		FrontTimesTest("Chocolate", 3,"ChoChoCho");
		FrontTimesTest("Abc", 3, "AbcAbcAbc");
		System.out.println("Called: " +count +"  errors: "+ errors);
	}

	}
	

