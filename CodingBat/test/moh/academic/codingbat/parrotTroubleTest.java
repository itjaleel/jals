package moh.academic.codingbat;

public class parrotTroubleTest {

	private parrotTrouble targetparrotTrouble;
	private int errors=0;
	private int count=0;

	public static void main(String[] args) {
		parrotTroubleTest app = new parrotTroubleTest();
	}

	public parrotTroubleTest(){
		targetparrotTrouble = new parrotTrouble();
		parrotTroubleTestCases();
	}
	
	public void parrotTroubleTest ( boolean talking, int hour, boolean expected){
		boolean actual = false;
		
		try {
			actual = targetparrotTrouble.parrotTrouble(talking, hour);
			System.out.println("Executed ");
		} catch (Exception e) {
			e.printStackTrace();
			errors++;
		}
		
		if (actual != expected){
			System.out.println("For expected" + expected + "returned "  + actual);
			errors++;
		}
		count++;
		
		
		
	}
	
	public void parrotTroubleTestCases(){
		parrotTroubleTest(true, 6,true);
		parrotTroubleTest(true, 7,false);
		parrotTroubleTest(false, 7,false);
		System.out.println("Called: " +count +"  errors: "+ errors);
	}
	
	

}
