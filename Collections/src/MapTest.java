import java.util.*;

class MapTest {
	public static void main(String[] args) {
//		mapMethods();
		backedCollection();
	}

	public static void test() {
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Dog("aiko")); // add some key/value pairs
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");
		Dog d1 = new Dog("clover"); // let's keep this reference
		m.put(d1, "Dog key");
		m.put(new Cat(), "Cat key");

		System.out.println(m);
		d1.name = "magnolia";
		System.out.println(" Test :" + m.get(d1)); // #1
		d1.name = "clover";
		System.out.println(m.get(new Dog("clover"))); // #2
		d1.name = "arthur";
		System.out.println(m.get(new Dog("clover"))); // #3

		System.out.println(m.get("k1")); // #1
		String k2 = "k2";
		System.out.println(m.get(k2)); // #2
		Pets p = Pets.CAT;
		System.out.println(m.get(p)); // #3
		System.out.println(m.get(d1)); // #4
		System.out.println(m.get(new Cat())); // #5
		System.out.println(m.size()); // #6
	}

	public static void mapMethods() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sachin");
		map.put(2, "Durgesh");
		map.put(3, "Gautam");
		map.put(4, "Virat");
		map.put(5, "Yuvi");
		map.put(6, "Dhoni");
		map.put(7, "Raina");
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(map);
		// treeMap=(TreeMap<Integer, String>) map;
		System.out.println(treeMap);
		System.out.println(treeMap.descendingMap());
		System.out.println(treeMap.descendingKeySet());
		System.out.println("Polling :" + treeMap.pollFirstEntry());
		System.out.println("Polling :" + treeMap.pollLastEntry());
		System.out.println(treeMap);
	}

	public static void backedCollection() {
		try {
			TreeMap<String, String> map = new TreeMap<String, String>();
			map.put("a", "ant");
			map.put("d", "dog");
			map.put("h", "horse");
			SortedMap<String, String> submap;
			submap = map.subMap("b", "g"); // #1 create a backed collection
			System.out.println(map + " " + submap); // #2 show contents
			map.put("b", "bat"); // #3 add to original
//			submap.put("f", "fish"); // #4 add to copy
			map.put("r", "raccoon"); // #5 add to original - out of range
//			submap.put("p", "pig"); // #6 add to copy - out of range
			System.out.println(map + " " + submap); // #7 show final contents
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}