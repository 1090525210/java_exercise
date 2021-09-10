package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;


public class Test {
	public static int compareName(Student st1, Student st2) {
		return (st1.getAge()-st2.getAge())==0 ? st1.getName().compareTo(st2.getName()):(st1.getAge()-st2.getAge());
	}
	public static void main(String[] args) {
		List<Student> stlist = new ArrayList<Student>();
		stlist.add(new Student(20,"Karl"));
		stlist.add(new Student(22,"John"));
		stlist.add(new Student(21,"Tom"));
		stlist.add(new Student(23,"Sun"));
		stlist.add(new Student(20,"Kar"));
		stlist.add(new Student(20,"Karls"));
		stlist.add(new Student(20,"Kara"));
		
		
		//stlist.sort(Comparator.comparing(sd->((Student)sd).age).reversed().thenComparing(sd->((Student)sd).name));
		
		Collections.sort(stlist, ((st1,st2)->(st1.getAge()-st2.getAge())==0 ? st1.getName().compareTo(st2.getName()):(st1.getAge()-st2.getAge()))); 
		
		Collections.sort(stlist, Comparator.comparing(Student::getAge));
		Collections.sort(stlist, Test::compareName);
		
		//stlist.forEach(st->System.out.println("Student("+st.getName()+", "+st.getAge()+")"));
		
		//stlist.stream().filter(student-> student.getAge() > 20).forEach(System.out ::println);;

//		List<Student> filtered=stlist.stream()
//			.filter(student-> student
//			.getAge() > 20)
//			.limit(2)
//			.collect(Collectors.toList());
//		System.out.println(filtered);
		
		//stlist.stream().map(st -> st.getName()).forEach(System.out::println);
		
		stlist.stream().flatMap(st -> { 
			String[] name = st.getName().split("");
			Stream<String> s2 = Arrays.stream(name);
			return s2;
		}).forEach(System.out::println);
		
		
		Student student = new Student(0, null);
		Consumer<Integer> getter = student::setAge;
		BiConsumer<Student, Integer> g = Student::setAge;
	}
}
