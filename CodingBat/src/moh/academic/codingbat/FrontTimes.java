package moh.academic.codingbat;

public class FrontTimes {
	public String FrontTimes( String str, int n){
	StringBuilder sb = new StringBuilder();
	String sub = null;
	if( str.length()<=3){
		sub=str;
		}else{
		sub = str.substring(0,3);
	}
    for ( int i =0 ; i<n; i++){
    	sb.append(sub);
    }
    return sb.toString();
	}
}

