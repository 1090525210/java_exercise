package reflection;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Student {
	@Print(format = "The student age is %s ")
	private int age;
	
	@Print(format = "The student name is %s")
	private String name;
	
	public Student() {}
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
    public String toString() {
        return "[name=" + name + ", age=" + age +"]";
    }
	

}
