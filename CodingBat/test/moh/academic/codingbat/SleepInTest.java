package moh.academic.codingbat;

public class SleepInTest {
	private SleepIn targetSleepIn;
	private int errors=0;
	private int count=0;

	public static void main(String[] args) {
		SleepInTest app = new SleepInTest();
	}

	public SleepInTest(){
		targetSleepIn  = new SleepIn();
		sleepInTestCases();
	}

	public void sleepInTest(boolean weekday, boolean vacation,boolean expected) {
		boolean actual = false;
		
		try {
			actual = targetSleepIn.sleepIn(weekday, vacation);
			System.out.println("Called" );
		} catch (Exception e) {
            System.out.println( "expected" + expected + ",weekday" + weekday + ",vacation" + vacation + " " + expected);
			e.printStackTrace();
		}
		
		if (actual != expected){
			System.out.println("For expected" + expected + ",weekday "+ weekday + ",vacation " + vacation );
			errors++;
		}
		count++;
	}
	public void sleepInTestCases(){
		sleepInTest(false,false,true);
		sleepInTest(true,false,false);
		sleepInTest(false,true,true);
		sleepInTest(true,true,true);
		System.out.println("Called" +count +"errors "+ errors);
	}

	}
	

