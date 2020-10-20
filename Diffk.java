package two_pointer_interviewBit;

import java.util.ArrayList;

public class Diffk {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = { 1, 2, 2, 3, 4 };
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(diffPossible(list, k));
	}

	private static int diffPossible(ArrayList<Integer> list, int k) {
		int p1 = 0, p2 = 0;
		while (p1 < list.size() && p2 < list.size()) {
			if((list.get(p2) - list.get(p1)) == k && p1 != p2) {
				return 1;
			}else if((list.get(p2) - list.get(p1)) <= k) {
				p2++;
			}else {
				p1++;
			}
		}
		return 0;
	}
}
