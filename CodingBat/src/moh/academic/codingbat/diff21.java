package moh.academic.codingbat;

public class diff21 {
	public int diff21(int n) {
		  int diff = 0 ;
		  diff = Math.abs(21 - n);
		  if(n>21){
		  diff = 2*diff;}  
		  return diff;  
		}
}
