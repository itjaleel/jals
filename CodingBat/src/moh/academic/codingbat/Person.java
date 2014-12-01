package moh.academic.codingbat;

import java.util.Comparator;

public class Person {

	private String name;
	private int score;
	private String address1;
	
	public Person(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", score=" + score + "]";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

}

class PersonScoreComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		int result = -1;
		if (o1.getScore() == o2.getScore()) {
			result = 0;
		}
		if (o1.getScore() > o2.getScore()) {
			return 1;
		}
		return result;
	}
}

class PersonNameScoreComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		int result = -1;
		if (o1.getScore() == o2.getScore()) {
			result = o1.getName().compareTo(o2.getName());
		}
		if (o1.getScore() > o2.getScore()) {
			return 1;
		}
		return result;
	}
}
