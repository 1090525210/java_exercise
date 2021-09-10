package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> stlist = new ArrayList<>();
		stlist.add(new Student(20,"Karl"));
		stlist.add(new Student(22,"John"));
		stlist.add(new Student(21,"Tom"));
		stlist.add(new Student(23,"Sun"));
		stlist.add(new Student(20,"Karls"));
		stlist.add(new Student(20,"Kara"));
		
		Collections.sort(stlist);
		
		stlist.forEach(st->System.out.println("Student("+st.name+", "+st.age+")"));
		
//		for(Student st:stlist) {
//			System.out.println("Student("+st.name+", "+st.age+")");
//		}
		
	}
}
