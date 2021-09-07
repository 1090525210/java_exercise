//String 类
package string;

public class Test {
	public static void main(String[] args) {
		String str ="I thought a thought. But the thought I thought wasn't the thought I thought I thought. If the thought I thought I thought had been the thought I thought, I wouldn't have thought so much.";
		
		str = str.replace(".", " ").replace(",", " ");
		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<strArr.length;i++) {
			if(!sb.toString().contains(strArr[i])) {
				sb.append(strArr[i]+" ");
				
			}
		}
		System.out.println(sb.toString());
		
		


	}
}
