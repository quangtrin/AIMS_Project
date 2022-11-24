package array;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử trong mảng: ");
		int n = 0;
		int[] year = new int[n];
		try {
			n = sc.nextInt();
			year = new int[n];
			for(int i = 0;i<n;i++) {
				System.out.print("Nhập phần tử thứ "+(i+1)+": ");
				year[i] = sc.nextInt();
			}
		}catch(Exception e) {
			System.out.print("Nhập lỗi!");
			System.exit(0);
		}
		for(int i =0;i<n;i++) {
			for(int j =i;j<n;j++) {
				if(year[i]>year[j]) {
					int yearPhu = year[i];
					year[i] = year[j];
					year[j] = yearPhu;
				}
			}
		}
		int tong = 0;
		for(int i = 0;i<n;i++) System.out.print(year[i]+" ");
		for(int i = 0;i<n;i++) tong += year[i];
		System.out.print("\nTong = "+tong+"\n");
		System.out.print("Trung binh = "+(double)tong/(double)n);
	}

}
