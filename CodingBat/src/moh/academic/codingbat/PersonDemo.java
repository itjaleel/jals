package moh.academic.codingbat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PersonDemo {
	public static void main(String[] args) {
		PersonDemo personDemo = new PersonDemo();
	}
	
	public PersonDemo() {
	    		
		ArrayList<Person> myList = new ArrayList<Person>();

		PersonScoreComparator personScoreComparator = new PersonScoreComparator();
		PersonNameScoreComparator personNameScoreComparator = new PersonNameScoreComparator();

		myList.add(new Person("Jaleel", 90));
		myList.add(new Person("Raz", 75));
		myList.add(new Person("Bins", 92));
		myList.add(new Person("Raz", 70));
		
		for (Person i : myList) {
			System.out.println(i);
		}

		Collections.sort(myList, personScoreComparator);
        printMe(myList,"-----Sort By Score----------");

		Collections.sort(myList, personNameScoreComparator);
		printMe(myList,"-----Sort By score and name----------");

	    findAbove(myList,80);
	    findName(myList,"binu");
		
	}
	
	public void findAbove(ArrayList <Person> pList,int pMark ){
		ArrayList<Person> tmpList = new ArrayList<Person>();
		for (Person i : pList) {
			if(i.getScore() >pMark ){
				tmpList.add(new Person(i.getName(),i.getScore()));
			}
		}
		printMe(tmpList,"List of marks : Above 90");
	}
	
	public void findName(ArrayList <Person> pList,String pName ){
		
		ArrayList<Person> tmpList = new ArrayList<Person>();
		for (Person i : pList) {
			if(i.getName().equals(pName) ){
				tmpList.add(new Person(i.getName(),i.getScore()));
			}
		}
		printMe(tmpList,"List of : Name Like " + pName);
	}
	
	public void printMe(ArrayList<Person> printArray, String pStr){
		System.out.println(pStr);
		for (Person i:printArray){
			System.out.println(i);
		}
	}

}
