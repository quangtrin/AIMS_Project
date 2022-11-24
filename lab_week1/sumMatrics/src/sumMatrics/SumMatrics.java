package sumMatrics;
import java.util.Scanner;
public class SumMatrics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		System.out.print("Nhập m: ");
		int m = sc.nextInt();
		double[][] matric1 = new double[n][m];
		double [][] matric2 = new double[n][m];
		double [][] matric3 = new double[n][m];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				System.out.printf("matric1[%d][%d]: ",i,j);
				matric1[i][j] = sc.nextDouble();
				System.out.printf("matri2[%d][%d]: ",i,j);
				matric2[i][j] = sc.nextDouble();
				matric3[i][j] = matric1[i][j] + matric2[i][j];
			}
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				System.out.print(matric3[i][j] +" ");
			}
			System.out.print("\n");
		}
	}
}
