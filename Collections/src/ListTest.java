import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListTest implements Comparable<ListTest> {
	
	String title;
	String genre;
	String leadActor;
	
	ListTest(String t, String g, String a) {
		System.out.println("INSIDEE");
		title = t; this.genre = g; this.leadActor = a;
	}
	
	
	public String toString() {
	return title + " " + genre + " " + leadActor + "\n";
	}
	
	
	@Override
	public int compareTo(ListTest o) {
		// TODO Auto-generated method stub 
		return title.compareTo(o.getTitle());
	}
	
	
	public static void main(String[] args) {
		try {
			System.out.println("STARTS............");
			ArrayList<String> list = new ArrayList<String>();
			list.add("S");
			list.add("A");
			list.add("D");
			list.add("S");
			
			
			
			ArrayList<ListTest> list2 = new ArrayList<ListTest>();
			ArrayList<ListTest> list1 = new ArrayList<ListTest>(); 
			list1.add(new ListTest("Durgesh", "GM", "IAM"));
			list1.add( new ListTest("Ddfurgesh", "GM", "IAM"));
			list1.add( new ListTest("Durgrfggesh", "GM", "IAM"));
			list1.add(new ListTest("Durgrfggesh", "GM", "IAM"));
			Collections.sort(list1);
			
			Collections.sort(list2);
			for(ListTest st:list1){  
				System.out.println(st.getTitle() +" "+st.getGenre()+" "+st.getLeadActor());  
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

}
