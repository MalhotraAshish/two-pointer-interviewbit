package two_pointer_interviewBit;

import java.util.ArrayList;

public class Sort_by_Color {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = {0,1,2,0,1,2};
		for(int i = 0; i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println(sortColors(list));
	}

	private static ArrayList<Integer> sortColors(ArrayList<Integer> list) {
		int p1 = 0, p2 = list.size()-1, i = 0;
		while(p1<p2 && i<=p2) {
			if(list.get(i).equals(0)) {
				list.set(i, list.get(p1));
				list.set(p1, 0);
				p1++;
				i++;
			}else if(list.get(i).equals(2)) {
				list.set(i,list.get(p2));
				list.set(p2, 2);
				p2--;
			}else {
				i++;
			}
		}
		return list;
	}
}
