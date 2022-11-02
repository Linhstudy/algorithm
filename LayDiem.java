package GiaiThuat;
import java.util.Scanner;
public class LayDiem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap n : ");
			n = input.nextInt();
		} while ( n > 100 || n < 0 );
		int[] array = new int[n];
		for ( int i = 0; i< n;i++) {
			System.out.print("Nhap A["+i+"] : ");
			array[i]= input.nextInt();
		}
		System.out.print("Nhap m : ");
		int m = input.nextInt();
		System.out.println("Ket qua : "+PositionM(array,m,n));
	}
	public static int PositionM(int[] array, int m, int n) {
		int position=0;
		for ( int i = 0;i<n;i++)
			if (array[i]==m) {
				position = i;
				return position;
			}
					return -1;
	}
	
}
