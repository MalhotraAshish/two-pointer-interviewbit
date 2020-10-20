package two_pointer_interviewBit;

import java.util.ArrayList;

public class Remove_Duplicates_from_Sorted_Array_II {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = {1,1,1,2};
		for(int i = 0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(removeDuplicates(list));
	}

	private static int removeDuplicates(ArrayList<Integer> list) {
		int p1 = 0;
		int count = 0;
		for(int i = 0; i<list.size()-1; i++) {
			if(!list.get(i).equals(list.get(i+1))) {
				if(count<2) {
					list.set(p1, list.get(i));
					p1++;
				}
				count = 0;
			}else {
				count++;
				if(count<=2) {
					list.set(p1, list.get(i));
					p1++;
				}
			}
		}
		if(count<2) {
			list.set(p1, list.get(list.size()-1));
			p1++;
		}
		//System.out.println(list);
		return p1;
	}

}
