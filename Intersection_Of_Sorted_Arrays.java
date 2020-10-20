package two_pointer_interviewBit;

import java.util.ArrayList;

public class Intersection_Of_Sorted_Arrays {
	public static void main(String args[]) {
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		A.add(10000000);
		B.add(10000000);
		System.out.println(intersect(A, B));
	}

	private static ArrayList<Integer> intersect(final ArrayList<Integer> a, final ArrayList<Integer> b) {
		ArrayList<Integer> res = new ArrayList<>();
		int i = 0, j = 0;
		while(i<a.size() && j<b.size()) {
			if(a.get(i).equals(b.get(j))) {
				res.add(a.get(i));
				i++;
				j++;
			}else if(a.get(i)>b.get(j)) {
				j++;
			}else if(a.get(i)<b.get(j)) {
				i++;
			}
		}
		return res;
	}
}
