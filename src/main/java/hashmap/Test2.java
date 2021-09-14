package hashmap;
//P44
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		String[] arr = {"a","b","a","b","c","a","b","a","b","a","b","c","a","b","b","a","b","c","a","b","a","b"};
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				int count=0;
				for(int j =0;j<arr.length;j++) {
					if(arr[j].equals(arr[i])) {
						count++;
					}
				}
				map.put(arr[i], count);
			}
			
		}
		
		Set<String> ks = map.keySet();
		Iterator<String> it = ks.iterator();
		while(it.hasNext()) {
			String chara = it.next();
			int num = map.get(chara);
			System.out.println(chara + "的个数是： "+ num);
		}
		
	}
}
