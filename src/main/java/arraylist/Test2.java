package arraylist;
//é›†å?ˆç±»P21
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> randomArrayList = new ArrayList<>();
		for(int i=0;i<100;i++) {
			Random random = new Random();
			int rdInt = random.nextInt(32)+1;
			randomArrayList.add(rdInt);
		}
		Iterator<Integer> it = randomArrayList.iterator();
		while(it.hasNext()) {
			System.out.println("The random numbers are " + it.next());
		}
		
	}
}
