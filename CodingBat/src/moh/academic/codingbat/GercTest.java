package moh.academic.codingbat;

public class GercTest {



	    public static GregorianCalendar convertFromDMY(String dd_mm_yy) throws ParseException{

	        // this actually works, got rid of the original code idea
	        String[] splitDate = dd_mm_yy.split("-");
	        int days = Integer.parseInt(splitDate[0]);
	        int month = Integer.parseInt(splitDate[1]);
	        int year = Integer.parseInt(splitDate[2]);

	        // dates are going in right, checked in print statement,
	        // but the object is not getting formatted...
	        GregorianCalendar dateConverted = new GregorianCalendar(year, month, days);
	        format(dateConverted);
	        return dateConverted;
	    }

	    public static String format(GregorianCalendar date){

	        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
	        String dateFormatted = fmt.format(date);
	        return dateFormatted;
	    }
	}



