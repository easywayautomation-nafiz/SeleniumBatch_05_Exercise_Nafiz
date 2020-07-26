package HomeWork_2;

public class Ex_5 {

	public static void main(String[] args) {
		int[] A = { 1, 3, 5, 5, 6 };
		int i = 0;
		int finalValue = 0;

		for (i = 0; i < A.length; i++) {
			if (A[i] == 3 || A[i] == 5) {
				finalValue = A[i];
				System.out.println(finalValue);
			}

		}
		System.out.println(finalValue);
	} // answer is 3 or
		// than updated value 5
		// additional 5
}
