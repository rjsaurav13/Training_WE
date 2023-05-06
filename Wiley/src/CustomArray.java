
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArray extends ArrayList {
	
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}
		else {
			return super.add(o);
		}
	}
	
	public static void main(String[] args) {
		CustomArray list = new CustomArray();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(6);
		list.add(6);
		
		System.out.println(list);
		
		
		
		Set<GeniusStudent> setStudent = new HashSet<>();
		
		GeniusStudent gst1 = new GeniusStudent(101, "Rishav");
		GeniusStudent gst2 = new GeniusStudent(101, "Rishav");
		GeniusStudent gst3 = new GeniusStudent(103, "Steve");
		
		setStudent.add(gst1);
		setStudent.add(gst2);
		setStudent.add(gst3);
		
		System.out.println(setStudent);
	}

}