package two_pointer_interviewBit;

import java.util.ArrayList;

public class Remove_Element_from_Array {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = {4, 1, 1, 2, 1, 3};
		int val = 1;
		for(int i = 0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(removeElement(list, val));
	}

	private static int removeElement(ArrayList<Integer> list, int val) {
		int p1 = 0;
		for(int i = 0; i<list.size(); i++) {
			if(!list.get(i).equals(val)) {
				list.set(p1, list.get(i));
				p1++;
			}
		}
		return p1;
	}
}
