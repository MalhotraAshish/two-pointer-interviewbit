package two_pointer_interviewBit;

import java.util.ArrayList;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = {1};
		for(int i = 0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(maxArea(list));
	}

	private static int maxArea(ArrayList<Integer> list) {
		int ans = 0;
		int low = 0;
		int high = list.size()-1;
		while(low<high) {
			if(list.get(low)<list.get(high)) {
				ans = Math.max(ans, list.get(low)*(high - low));
				low++;
			}else {
				ans = Math.max(ans, list.get(high)*(high - low));
				high--;
			}
		}
		return ans;
	}

}
