import java.util.*;

 

class IteratorTest {
	public static void main(String[] args) {
		List<Dog> d = new ArrayList<Dog>();

		Dog dog = new Dog("aiko");
		d.add(dog);
		d.add(new Dog("clover"));
		d.add(new Dog("magnolia"));
		Iterator<Dog> i3 = d.iterator(); // make an iterator
		while (i3.hasNext()) {
			Dog d2 = i3.next(); // cast not required
			System.out.print(d2.name+" ");
		}
		System.out.println("\nsize " + d.size());
		System.out.println("get1 " + d.get(1).name);
		System.out.println("aiko " + d.indexOf(dog));
		d.remove(2);
		Object[] oa = d.toArray();
		for (Object o : oa) {
			Dog d2 = (Dog) o;
			System.out.print("oa " + d2.name);
		}
	}
}