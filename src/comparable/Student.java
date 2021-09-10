package comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
	 int age;
	 String name;
	
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
//	@Override
//	public  compareTo = st -> age-((Student)st).age;
	
	@Override
	public int compareTo(Student st) {
		int ageDif = age-st.age;
		int nameDif = name.compareTo(st.name);
		if(ageDif==0) {
			return nameDif;
		}else {
			return ageDif;
		}
	}
		
	
}
