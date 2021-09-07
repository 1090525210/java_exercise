//æ•°æ?®ç±»åž‹P37
package datatype2;

public class Test {
	public static void main(String[] args) {
		char[] arr=new char[] {'a','b','c','3','*','+','p','9'};
//		System.out.println(arr.length);
		char[] arr2 = new char[arr.length];
		for(int i =0;i<arr.length;i++) {
			arr2[i] = (char)('9'-i);
		}
		char[] arr3 =new char[arr.length];
		arr3 = arr2;
		arr2 = arr;
		arr= arr3;
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr2[i]);
		}
	}
		

}
