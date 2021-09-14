//基本语法P51
package fundamental2;

public class Test {
	public static void main(String[] args) {
	int count=0;
	for(int i =1;i<121;i++) {
		if(i%10 ==7 || (int)(i/10) ==7) {
			continue;
		}
		count+=1;
		System.out.print(i+" ");
		if(count%10==0) {
			System.out.println();
		}
	}
}
}
