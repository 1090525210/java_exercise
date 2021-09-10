package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import arraylist.Student;

public class Test {
	public static void main(String[] args) throws Exception{
		
		Class stdClass = Class.forName("reflection.Student");
		Constructor stdConstructor= stdClass.getDeclaredConstructor(int.class, String.class);
		
		Object student = stdConstructor.newInstance(20,"Bob");
		
		Field[] fields = student.getClass().getDeclaredFields();
		for(int i =0;i<fields.length;i++) {
			
			if(fields[i].isAnnotationPresent(Print.class)) {
				fields[i].setAccessible(true);
				
				Print annotation = fields[i].getAnnotation(Print.class);
				
				String format = annotation.format();
				System.out.println(String.format(format, fields[i].get(student)));
			}
		}
		
		
//		Field stdAgeField = stdClass.getDeclaredField("age");
//		stdAgeField.set(student, 22);
//		
//		Method stdMethod = stdClass.getDeclaredMethod("toString", null);
//		System.out.println(stdAgeField);
//		
//		Object result=stdMethod.invoke(student, null);
//		System.out.println(result);
		
		//System.out.println(String.format("This is %s one", "name"));
	}
}
