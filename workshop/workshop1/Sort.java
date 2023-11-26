import java.util.*;

class Sort {
	public static void main(String[] args) {
		System.out.println("Sort the Array");
		Scanner scn = new Scanner(System.in);
		Integer n = 8;
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			Integer k = scn.nextInt();
			arr.add(k);
		}

		Integer mid = n / 2;

		for (int i = 0; i < mid; i++) {
			Integer pos = i;
			while ((pos > 0) && (arr.get(pos) < arr.get(pos - 1))) {
				Integer temp = arr.get(pos);
				arr.set(pos, arr.get(pos - 1));
				arr.set(pos - 1, temp);
				pos--;
			}
		}

		for (int i = mid; i < n; i++) {
			Integer pos = i;
			while ((pos > 0) && (arr.get(pos) > arr.get(pos - 1))) {
				Integer temp = arr.get(pos);
				arr.set(pos, arr.get(pos - 1));
				arr.set(pos - 1, temp);
				pos--;
			}
		}

		// for i -> 0 to n
		// mul = mul*arr.get(i)

		System.out.println(arr);
		scn.close();
	}
}
