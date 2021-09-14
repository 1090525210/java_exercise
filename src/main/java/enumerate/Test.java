//枚举P15
package enumerate;

public class Test {
	enum Week{    
	Monday, Tuesday, Wednesday, Thursday, Friday,Saturday, Sunday; 
}

	public static void main(String[] args) {
		for(Week today : Week.values()) {
			System.out.println(today);
		}
	} 

}
