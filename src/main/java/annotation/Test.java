package annotation;



@MyAnnotation(name="Tony",sapId=0001,salary=10000)
public class Test {
	public static void main(String[] args) {
		Class<Test> testAnnoClass = Test.class;
			boolean annotationPresent=testAnnoClass.isAnnotationPresent(MyAnnotation.class);
		if (annotationPresent) {
			MyAnnotation annotation= testAnnoClass.getAnnotation(MyAnnotation.class);
			System.out.println(annotation.name());
			System.out.println(annotation.sapId());
			System.out.println(annotation.salary());
		}
	}

}
