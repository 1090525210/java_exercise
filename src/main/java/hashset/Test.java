package hashset;
//hashSet P28
import java.util.HashSet;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		HashSet<History> hisset =new HashSet<History>();
		History his1= new History();
		History his2= new History();
		History his3= new History();
		
		his1.setTime("公元前202年～公元220年");
		his1.setStory("汉朝");
		his2.setTime("公元618 ～ 907年");
		his2.setStory("唐朝");
		his3.setTime("公元1368年～ 1644年");
		his3.setStory("明朝");
		
		hisset.add(his3);
		hisset.add(his2);
		hisset.add(his1);
		
		Iterator<History> it=hisset.iterator();
		while(it.hasNext()) {
			History cur= it.next();
			System.out.println("("+cur.getTime()+", "+cur.getStory()+")");
		}
	}
}
