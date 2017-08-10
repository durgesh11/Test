import java.util.*;

class SearchObjArray {
	public static void main(String[] args) {
//		searchArray();
//		convertArraysToList();
		ListToArray();
	}

	static class ReSortComparator implements Comparator<String> { // #6
		public int compare(String a, String b) {
			return b.compareTo(a); // #7
		}
	}

	public static void searchArray() {
		String[] sa = { "one", "two", "three", "four" };
		Arrays.sort(sa); // #1
		for (String s : sa)
			System.out.print(s + " ");
		System.out.println("\none = " + Arrays.binarySearch(sa, "one")); // #2
		System.out.println("now reverse sort");
		ReSortComparator rs = new ReSortComparator(); // #3
		Arrays.sort(sa, rs);
		for (String s : sa)
			System.out.print(s + " ");
		System.out.println("\none = " + Arrays.binarySearch(sa, "one")); // #4
		System.out.println("one = " + Arrays.binarySearch(sa, "one", rs)); // #5
	}

	public static void ListToArray() {
		List<Integer> iL = new ArrayList<Integer>();
		iL.add(30);
		iL.add(13);
		iL.add(33);
		iL.add(873);
		
		Object[] oa = iL.toArray(); // create an Object array
		
		 for (int i = 0; i < oa.length; i++) {
			System.out.print(oa[i]+" ");
		}
		System.out.println();
		
		Integer[] ia2 = new Integer[3];
		ia2 = iL.toArray(ia2); // create an Integer array
		System.out.print(Arrays.toString(ia2));
		
	}
	
	
	public static void convertArraysToList() {
		String[] sa = { "one", "two", "three", "four" };
		List sList = Arrays.asList(sa); // make a List
		System.out.println("size " + sList.size());
		System.out.println("idx2 " + sList.get(2));
		sList.set(3, "six"); // change List
		System.out.println("");
		for (Iterator iterator = sList.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.print(object.toString()+" ");
		}
		System.out.println("");
		sa[1] = "five"; // change array
		for (String s : sa){
			System.out.print(s + " ");
		}
		
		System.out.println("");
		for (Iterator iterator = sList.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.print(object.toString()+" ");
		}
		System.out.println("");

		System.out.println("\nsl[1] " + sList.get(1));
	}

}