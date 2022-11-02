package GiaiThuat;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
		System.out.print("Nhập vào n : ");
		n = input.nextInt();
		} while ( n <= 1) ;
		int[] array = new int[n];
		
			System.out.println("Nhập vào giá trị của mảng");
			do {
			System.out.print("A["+0+"] : ");
			array[0] = input.nextInt();
			} while (array[0] < 0);
				for ( int i = 1; i < n;i++) {
						do {
							System.out.print("A["+i+"] : ");
							array[i] = input.nextInt();
 					
						} while ( array[i] < 0 || array[i-1] > array[i]);
		
		}
			System.out.println("Mảng vừa nhập");
				for ( int i = 0; i < n; i++) {
						System.out.print(array[i]+ " ");
		}	System.out.println();
			boolean KQ = FindK(array,n);
				if (KQ==true) {
					System.out.println("K = : ");
				}else {
					System.out.println("K không tồn tại");
				}
	}
	public static boolean FindK(int []array, int n) {
		int mid = n/2, a = 0,PBmid = 0,PAmid = 0;
		int [] arr1 = new int[n/2];
		int [] arr2 = new int[n-n/2];
		for ( int i = 0 ; i < n/2 ; i++) {
			arr1[i] = array[i];
			PBmid = PBmid + array[i];
		}
		for ( int i = n/2 ; i < n;i++) {
			arr2[a] = array[i];
			PAmid = PAmid + array[i];
			a++;
		}
		System.out.println(PBmid+"      "+PAmid);
		// Check nếu mảng chỉ có 2 giá trị
		if (n==2) 
		{
			if (array[0]==array[1]) 
			{
				return true;
			} else { 
				return false;
			} 
		// Khi mảng có >3 gía trị
		} else {
			if (PBmid==PAmid) 
			{
				return true;
			} else {
						if (PBmid>PAmid)
						{		
								mid = mid - 1;
								PBmid = 0; PAmid = 0; a =0;
					
							for ( int i = 0; i < mid - 1; i++) {
									arr1[i] = array[i];
									PBmid = PBmid + array[i];
									}
							for ( int i = mid - 1 ; i < n; i++) {
									arr2[a] = array[i];
									a++;
									}
						}
						if (PBmid<PAmid)
						{
								mid = mid + 1;
								PBmid = 0; PAmid = 0; a =0;
						
								for ( int i = 0; i < mid + 1; i++) {
									arr1[i] = array[i];
									PBmid = PBmid + array[i];
									}
								for ( int i = mid + 1 ; i < n; i++) {
									arr2[a] = array[i];
									a++;
									}
						}
						return FindK(array,n);
					}
				}
		}
}
