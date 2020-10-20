package two_pointer_interviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class Three_Sum {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = { 2147483647, -2147483648, -2147483648, 0, 1 };
		// int arr[] = {5, -2, -1, -10, 10};
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		int target = -5;
		System.out.println(threeSumClosest(list, target));
	}

	private static int threeSumClosest(ArrayList<Integer> A, int B) {
		int res = 0, diff = Integer.MAX_VALUE;

		Collections.sort(A);
		for (int i = 0; i < A.size() - 2; i++) {
			int j = i + 1, k = A.size() - 1;
			while (j < k) {
				int sum = A.get(i) + A.get(j) + A.get(k);

				if (sum == B)
					return sum;
				else if (sum > B)
					k--;
				else
					j++;

				if (Math.abs(B - sum) < diff) {
					res = sum;
					diff = Math.abs(B - sum);
				}

			}
		}

		return res;
	}
}
