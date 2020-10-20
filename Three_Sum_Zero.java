package two_pointer_interviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class Three_Sum_Zero {
	public static void main(String args[]) {
		int arr[] = {-1, 0, 1, 2, -1, -4};
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		System.out.println(threeSum(list));
	}

	private static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
		Collections.sort(A);
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for(int i = 0; i<A.size()-2; i++) {
			int p1 = i+1;
			int p2 = A.size()-1;
			while(p1<p2) {
				
				long sum = ((long) A.get(p1) + (long) A.get(p2)) + (long) A.get(i);
				if(sum == 0) {
					ArrayList<Integer> list  = new ArrayList<>();
					list.add(A.get(i));
					list.add(A.get(p1));
					list.add(A.get(p2));
		            if(res.indexOf(list)==-1)
		                res.add(list);
					p1++;
					p2--;
				}
				else if(sum > 0) {
					p2--;
				}else {
					p1++;
				}
				
			}
		}
		return res;
	}
}
