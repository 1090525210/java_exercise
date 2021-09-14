package exception;

public class Test {
	public static void main(String[] args) {
		String[] arr = {"ab","la","9999","132"};
		for(int i=0;i<arr.length;i++) {
			try {
				int num=Integer.valueOf(arr[i]);
				System.out.println("Success!");
			
			}catch(Exception e){
				System.out.println("Failed on "+ arr[i]);
			}
		}
	}
}

