import java.util.*;

class SetTest {
	public static void main(String[] args) {
//		TreeSetAdd();
//		firstDemoSets();
		setMethods();
	}

	public static void TreeSetAdd() {
		TreeSet<Cricketer> playerSet = new TreeSet<Cricketer>(
				new CompareCricketer());
		playerSet.add(new Cricketer("Sachin", 1));
		playerSet.add(new Cricketer("Zahir", 9));
		playerSet.add(new Cricketer("Mahi", 7));
		playerSet.add(new Cricketer("Bhajji", 8));
		playerSet.add(new Cricketer("Viru", 2));
		playerSet.add(new Cricketer("Gautam", 4));
		playerSet.add(new Cricketer("Ishant", 10));
		playerSet.add(new Cricketer("Umesh", 11));
		playerSet.add(new Cricketer("Pathan", 5));
		playerSet.add(new Cricketer("Virat", 3));
		playerSet.add(new Cricketer("Raina", 6));
		Iterator<Cricketer> it = playerSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}

		System.out.println("Original Set:" + playerSet);
		System.out.println("First Name: " + playerSet.first());
		System.out.println("Last Name: " + playerSet.last());
		TreeSet<Cricketer> newPlySet = (TreeSet<Cricketer>) playerSet.subSet(
				new Cricketer("Gautam", 4), new Cricketer("Ishant", 10));
		System.out.println("Sub Set: " + newPlySet.toString());
	}

	public static void firstDemoSets() {
		TreeSet<String> playerSet = new TreeSet<String>();
		playerSet.add("Sachin");
		playerSet.add("Zahir");
		playerSet.add("Mahi");
		playerSet.add("Bhajji");
		playerSet.add("Viru");
		playerSet.add("Gautam");
		playerSet.add("Ishant");
		playerSet.add("Umesh");
		playerSet.add("Pathan");
		playerSet.add("Virat");
		playerSet.add("Sachin"); // This is duplicate element so will not be
									// added again
		// below will print list in alphabetic order
		System.out.println("Original Set:" + playerSet);
		System.out.println("First Name: " + playerSet.first());
		System.out.println("Last Name: " + playerSet.last());
		TreeSet<String> newPlySet = (TreeSet<String>) playerSet.subSet("Mahi",
				"Virat");
		System.out.println("Sub Set: " + newPlySet);
	}

	public static void setMethods() {
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205); // add some departure times
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		times.add(10);
		times.add(20);
		times.add(30);
		times.add(40);
		times.add(50);
		times.add(75);
		times.add(99);

		// Java 5 version
		TreeSet<Integer> subset = new TreeSet<Integer>();
		System.out.println("times :" + times);

		subset = (TreeSet) times.headSet(1600);
		System.out.println("J5 - last before 4pm is: " + subset.last());
		TreeSet<Integer> sub2 = new TreeSet<Integer>();
		sub2 = (TreeSet) times.tailSet(2000);
		System.out.println("J5 - first after 8pm is: " + sub2.first());
		// Java 6 version using the new lower() and higher() methods
		System.out.println("J6 - last before 4pm is: " + times.lower(1600));
		System.out.println("J6 - first after 8pm is: " + times.higher(2000));
		System.out.println("times :" + times);
		System.out.println("NEXT :" + times.floor(98));
		System.out.println("POLL :"+times.pollFirst());
		System.out.println("POLL :"+times.pollLast());
		System.out.println("times :" + times);
		System.out.println("headSet :"+times.headSet(20));
		System.out.println("times :" + times);

	}
}