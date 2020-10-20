package two_pointer_interviewBit;

import java.util.ArrayList;
import java.util.List;

public class Array_3_Pointers {
	public static void main(String args[]) {
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();

		int arrA[] = { 1, 4, 10 };
		int arrB[] = { 2, 15, 20 };
		int arrC[] = { 10, 12 };

		for (int i = 0; i < arrA.length; i++) {
			A.add(arrA[i]);
		}
		for (int i = 0; i < arrB.length; i++) {
			B.add(arrB[i]);
		}
		for (int i = 0; i < arrC.length; i++) {
			C.add(arrC[i]);
		}
		
		System.out.println(minimize(A,B,C));
	}

	private static int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) {
		int i = 0;
		int j = 0;
		int k = 0;
		int ans = Integer.MAX_VALUE;
		while(i<a.size() && j<b.size() && k<c.size()) {
			ans = Math.min(ans, Math.max(Math.abs(a.get(i)-b.get(j)), Math.max(Math.abs(b.get(j)-c.get(k)), Math.abs(c.get(k)-a.get(i)))));
			if(b.get(j) <= a.get(i) && b.get(j) <= c.get(k)) {
				j++;
			}else if(c.get(k) <= a.get(i) && c.get(k) <= b.get(j)) {
				k++;
			}else if(a.get(i) <= b.get(j) && a.get(i) <= c.get(k)) {
				i++;
			}
		}
		return ans;
	}
}
