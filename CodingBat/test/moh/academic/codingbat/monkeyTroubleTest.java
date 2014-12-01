package moh.academic.codingbat;

public class monkeyTroubleTest {
	private monkeyTrouble targetMonkeyTrouble;
	private int errors=0;
	private int count=0;

	public static void main(String[] args) {
		monkeyTroubleTest app = new monkeyTroubleTest();
	}

	public monkeyTroubleTest(){
		targetMonkeyTrouble = new monkeyTrouble();
		monkeyTroubleTestCases();
	}

	public void monkeyTroubleTest(boolean aSmile, boolean bSmile,boolean expected) {
		boolean actual = false;
		
		try {
			actual = targetMonkeyTrouble.monkeyTrouble(aSmile, bSmile);
			System.out.println("Called" );
		} catch (Exception e) {
            System.out.println( "expected" + expected + ",aSmile" + aSmile + ",bSmile" + bSmile + " " + expected);
			e.printStackTrace();
		}
		
		if (actual != expected){
			System.out.println("For expected" + expected + ",aSmile "+ aSmile + ",bSmile " + bSmile );
			errors++;
		}
		count++;
	}
	
	public void monkeyTroubleTestCases(){
		monkeyTroubleTest(false,false,true);
		monkeyTroubleTest(true,false,false);
		monkeyTroubleTest(false,true,false);
		monkeyTroubleTest(true,true,true);
		System.out.println("Called" +count +"errors "+ errors);
	}



	}
	

