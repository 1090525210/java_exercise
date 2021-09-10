package hashmap;
//P43
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Map<Integer,String> hisMap= new HashMap<Integer,String>();
		hisMap.put(-202, "汉朝");
		hisMap.put(618, "唐朝");
		hisMap.put(1368, "明朝");
		
		Set<Integer> ks = hisMap.keySet();
		Iterator<Integer> it = ks.iterator();
		while(it.hasNext()) {
			int time = it.next();
			String story = hisMap.get(time);
			System.out.println(story + "的创建时间是： "+ time+ "年。");
		}
	}
}
