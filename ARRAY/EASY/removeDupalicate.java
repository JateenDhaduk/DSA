/**
 * removeDupalicate provides a simple utility to remove duplicate integers
 * from an array while preserving the original insertion order.
 */

import java.util.*;

public class removeDupalicate {
	public static int[] removeDuplicates(int[] arr) {
		if (arr == null) return null;
		if (arr.length == 0) return new int[0];

		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int v : arr) set.add(v);

		int[] res = new int[set.size()];
		int i = 0;
		for (int v : set) res[i++] = v;
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 1, 4, 4, 5};
		int[] unique = removeDuplicates(arr);
		System.out.println(Arrays.toString(unique));
	}
}

