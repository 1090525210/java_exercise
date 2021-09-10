package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Integer[] arr=  { 6, 8, 12, 3, 10, 1, 34, 67, 23, 45};
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		
		Arrays.sort(arr);
		Collections.sort(list);
		//有个问题，Arrays无法对int型数组进行逆排序
		Arrays.sort(arr,Collections.reverseOrder());
		Collections.reverse(list);
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
	}
}
