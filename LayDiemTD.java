package GiaiThuat;
import java.util.Scanner;
public class LayDiemTD {

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
//		System.out.println(TopDown(array,m,n));
		
		boolean KQ1 = TopDown(array,m,n);
		System.out.println(KQ1);
		if(KQ1==true) {
			System.out.println("Giá trị "+m+" tồn tại trong mảng");
		} else {
				System.out.println("Giá trị "+m+" không tồn tại trong mảng");
				}
		}
	public static boolean TopDown(int[] array, int m, int n) {
		int arr1=0;
		int arr2=0;
		if (n==1) {
			if (array[0]==m)
					return true;
			else 
				return false;
		} else {
			int [] array1 = new int[n/2];
			
			int [] array2 = new int[n-n/2];
			
			for ( int i = 0; i < n / 2; i++) {
		        array1[arr1] = array[i];
		        arr1++;
		    }
			
			for ( int i = n/2 ; i < n; i++) {
		        array2[arr2] = array[i];
		        arr2++;
		    }
			return (TopDown(array1,m,array1.length) || TopDown(array2,m,array2.length));
		}
		
	}

}
