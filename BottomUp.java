package GiaiThuat;
import java.util.Scanner;
public class BottomUp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhap n :");
			n = input.nextInt();
		} while ( n > 10000 || n < 0 );
		double[] array = new double[n];
		for ( int i = 0; i< n;i++) {
			System.out.print("Nhap A["+i+"] :");
			array[i]= input.nextDouble();
	}
		System.out.println("Cac phan tu mang");
		for ( int i = 0; i<n;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		System.out.println("Nhap m :");
		double m = input.nextDouble();
		System.out.println(m+" "+FindM(array, m, n));
		}
	public static String FindM(double[] array, double m, int n) {
		String a = "co ton tai trong mang.";
		String b = "khong ton tai trong mang.";
		for ( int i = 0; i < n; i++ ) {
			if (array[i]==m)
				return a;
		}
		return b;
	}
}
