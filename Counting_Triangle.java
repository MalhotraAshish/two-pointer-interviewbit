package two_pointer_interviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class Counting_Triangle {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = { 1, 1, 1, 2, 2 };
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		System.out.println(nTriang(list));
	}

	private static int nTriang(ArrayList<Integer> list) {
		if (list.size() < 3) {
			return 0;
		}
		int count = 0;
		int mod = 1000000007;
		Collections.sort(list);
		for (int i = list.size() - 1; i > 1; i--) {
			if (list.get(i) == 0) {
				continue;
			}
			int p1 = 0;
			int p2 = i - 1;
			while (p1 < p2) {
				long sum = (long) list.get(p1) + (long) list.get(p2);
				if (sum > (long) list.get(i)) {
					count = (count + (p2 - p1)%mod)%mod;
					p2--;
				} else {
					p1++;
				}
			}
		}
		return count;
	}
}
