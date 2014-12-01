package moh.academic.codingbat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo {

   public static void main(String[] args) {
	   
	  DateDemo dateDemo = new DateDemo();
      Date date1 = new Date(2011, 11, 05);
      Date date2 = new Date(2015, 1, 21);
     
      String dt = "05 NOV 2010";
      dateDemo.gregDate(dt);

   }

   public void gregDate(String  pDate){
	   SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy");
	   GregorianCalendar gCal = new GregorianCalendar();
	try {
		gCal.setTime(df.parse(pDate));
	} catch (ParseException e) {
		e.printStackTrace();
	}
	   df.applyPattern("dd MMM,yy");
	   System.out.println(  df.format(gCal.getTime())  );
	   df.applyPattern("EEEE dd MMM,yy");
	   System.out.println(  df.format(gCal.getTime())  );
   }

   public void testHigherDate(Date pDate1, Date pDate2 ){
	   if (pDate1.after(pDate2)){
	    	  System.out.println("Date 1 is after Date 2");
	      }
	      else{
	    	  System.out.println("Date 2 is after Date 1");
	      }
	   
   }
   
   public void findDiff(Date pDate1, Date pDate2 ){
	   long daysBetween;
	   SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
	   
	   daysBetween = (((( pDate2.getTime() - pDate1.getTime())/1000)/60)/60)/24  ;
	   System.out.println("Days between " +  sdf.format(pDate1) + " and " + sdf.format(pDate2) +" is "+  daysBetween);
	   
   }
   
   
}


