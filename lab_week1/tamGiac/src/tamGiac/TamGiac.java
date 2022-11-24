package tamGiac;
import java.util.Scanner;
public class TamGiac {

	public static void main(String[] args) {
		System.out.print("Nhập n: ");
		Scanner sc = new Scanner(System.in);
		int n=0;
		int nPhu = 0;
		try {
			 n = sc.nextInt();
			 nPhu = n;
		}catch(Exception e) {
			System.out.print("Nhập lỗi! ");
			System.exit(0);
		}
		while(n>=0) {
			for(int i = 0;i<=n-1;i++) System.out.print(" ");
			for(int i = 0;i<(nPhu - n)*2+1;i++) System.out.print("*");
			for(int i = 0;i<=n-1;i++) System.out.print(" ");
			System.out.print("\n");
			n--;		
		}
	}

}
