// é›†å?ˆP20
package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		
		Student st1= new Student();
		st1.setID(0001);
		st1.setName("æ?");
		
		Student st2= new Student();
		st2.setID(0002);
		st2.setName("ç‹");
		
		Student st3= new Student();
		st3.setID(0003);
		st3.setName("å­™");
		
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		
		Iterator<Student> student = stList.iterator();
		while(student.hasNext()) {
			Student st = student.next();
			
			System.out.println("The student id is "+ st.getID() + ", the name is " + st.getName());
		}
	}
}
