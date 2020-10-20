package two_pointer_interviewBit;

import java.util.ArrayList;

public class Max_Continuous_Series_of_1s {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = {1,1,0,1,1,0,0,1,1,1};
		for(int i = 0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		int k = 1;
		System.out.println(maxone(list, k));
	}

	private static ArrayList<Integer> maxone(ArrayList<Integer> list, int k) {
		int p1 = 0, p2 = 0, l = 0, r = 0; 
		while(p2<list.size()) {
			if(list.get(p2) == 0) {
				k--;
			}
			if(k<0) {
				if(list.get(p1) == 0) {
					k++;
				}
				p1++;
			}
			p2++;
			if(p2-p1>r-l) {
				r = p2;
				l = p1;
			}
		}
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = l; i<r; i++) {
			res.add(i);
		}
		return res;
	}
}
