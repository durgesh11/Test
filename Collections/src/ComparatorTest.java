import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al, new NameComparator());

		System.out.println("sorting by Name...");
		for (Iterator<Student> iterator = al.iterator(); iterator.hasNext();) {
			Student object = iterator.next();
			System.out.println("\tName :" + object.name + " Age :" + object.age+ " Roll No. :" + object.rollno);
		}

		System.out.println("\nsorting by age...");

		Collections.sort(al, new AgeComparator());

		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student object = itr2.next();
			System.out.println("\tAge :" + object.age + "\tName :"+ object.name + " Roll No. :" + object.rollno);
		}
		
		TreeSet<Student> playerSet = new TreeSet<Student>(new NameComparator());  
		ArrayList<Student> al1 = new ArrayList<Student>(playerSet);
		
		
	}

}

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return s1.name.compareTo(s2.name);
	}

}

class AgeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}
