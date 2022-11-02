package GiaiThuat;

import java.util.Scanner;

public class SearchBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập vào n : ");
			n = input.nextInt();
		} while (n <= 1);
		int[] array = new int[n];

		System.out.println("Nhập vào giá trị của mảng");
		do {
			System.out.print("A[" + 0 + "] : ");
			array[0] = input.nextInt();
		} while (array[0] < 0);
		for (int i = 1; i < n; i++) {
			do {
				System.out.print("A[" + i + "] : ");
				array[i] = input.nextInt();

			} while (array[i] < 0 || array[i - 1] > array[i]);

		}
		System.out.println("Mảng vừa nhập");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("K = " + FindK(array, n));
	}

	/**
	 * @param array
	 * @param n
	 * @return
	 */
	public static int FindK(int[] array, int n) {
		int mid = n / 2, a = 0, b = 0, SumBeforeMid = 0, SumAfterMid = 0;
		int[] arr1 = new int[0];
		int[] arr2 = new int[0];
		// Array with 2 values
//		System.out.println("Mid K =" +mid);
		if (n == 2) {
			if (array[0] == array[1]) {
				return mid;
			} else {
				return -1;
			}
		} else {
			arr1 = new int[(n / 2) + 1];
			arr2 = new int[n - ((n / 2) +1)];
			// Sum Array Before mid
			for (int i = 0; i < (n / 2) + 1; i++) {
				arr1[b] = array[i];
				SumBeforeMid = SumBeforeMid + array[i];
				b++;
			}
			// Sum Array After mid
			for (int i = (n / 2) + 1; i < n; i++) {
				arr2[a] = array[i];
				SumAfterMid = SumAfterMid + array[i];
				a++;
			}
		}
//			System.out.println("Tổng Trước : "+SumBeforeMid+" Tổng Sau : "+SumAfterMid);
		// Array with more than 2 values
		// Sum A = B
		if (SumBeforeMid == SumAfterMid) {
			return arr1.length;
		}
		// Sum A < B
		else if (SumBeforeMid < SumAfterMid) {
			arr1 = new int[arr1.length + 1];
			arr2 = new int[arr2.length - 1];
			SumBeforeMid = 0;
			SumAfterMid = 0;
			a = 0;
			b = 0;
			for (int i = 0; i < n / 2 + 1; i++) {
				arr1[b] = array[i];
				SumBeforeMid = SumBeforeMid + array[i];
				b++;
			}
			for (int i = n / 2 + 1; i < n; i++) {
				arr2[a] = array[i];
				SumAfterMid = SumAfterMid + array[i];
				a++;
			}
		}
		// Sum B > A(SumBeforeMid > SumAfterMid )
		else if (SumBeforeMid > SumAfterMid) {
			arr1 = new int[arr1.length - 1];
			arr2 = new int[arr2.length + 1];
			SumBeforeMid = 0;
			SumAfterMid = 0;
			b = 0;
			a = 0;
			for (int i = 0; i < mid - 1; i++) {
				arr1[b] = array[i];
				SumBeforeMid = SumBeforeMid + array[i];
				b++;
			}
			for (int i = mid - 1; i < n; i++) {
				arr2[a] = array[i];
				SumAfterMid = SumAfterMid + array[i];
				a++;
			}
	}return FindK(array, n);
}
}
