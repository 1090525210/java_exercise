//æ•°æ?®ç±»åž‹P37
package datatype2;

public class Test2 {
	public static void main(String[] args) {
		int[] a =new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] b =new int[10];
		for(int i = 0;i<10;i++) {
			b[i]=a[9-i];
		}
		for(int i = 0;i<10;i++) {
			System.out.println(b[i]);
		}
	}
}
