//基本语法P67
package fundamental;

public class Test {
	public static void test(char a, short b, float c, boolean d) {
		a='$';
		b=12;
		c=66f;
		d=false;
		System.out.println(a + "," + b + "," + c + "," + d);
	} 
	public static void main(String[] args) {
		char a ='*';
		short b =59;
		float c =144f;
		boolean d= true;
		test(a,b,c,d);
		System.out.println(a + "," + b + "," + c + "," + d);
	}
}
