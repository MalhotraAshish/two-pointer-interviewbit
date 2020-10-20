package two_pointer_interviewBit;

import java.util.ArrayList;

public class Merge_Two_Sorted_Lists_II {
	public static void main(String args[]) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(8);

		b.add(6);
		b.add(9);
		merge(a, b);
	}

	private static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> res = new ArrayList<>();
		int i = 0, j = 0;
		while (i < a.size() && j < b.size()) {
			if (a.get(i) <= b.get(j)) {
				res.add(a.get(i));
				i++;
			} else if (a.get(i) > b.get(j)) {
				res.add(b.get(j));
				j++;
			}
		}
		if(i<a.size()) {
			for(int k = i; k<a.size(); k++) {
				res.add(a.get(k));
			}
		}
		if(j<b.size()) {
			for(int k = j; k<b.size(); k++) {
				res.add(b.get(k));
			}
		}
		for(int k = 0; k<res.size(); k++) {
			if(k<a.size()) {
				a.set(k, res.get(k));
			}else {
				a.add(res.get(k));
			}
		}
	}
}
