package giaiPt;
import javax.swing.JOptionPane;
public class GiaiPt {

	public static void giaiPtBac2(double a, double b,double c) {
		double delta = Math.pow(b, 2) - 4*a*c;
		double x1,x2;
		if(delta > 0) {
			x1 = (-b + Math.sqrt(delta))/(2*a); 
			x2 = (-b - Math.sqrt(delta))/(2*a);
			JOptionPane.showMessageDialog(null,"x1 = "+x1+"\nx2 = "+x2);
		}
		else if(delta == 0) {
			x1 = -b/(2*a);
			JOptionPane.showMessageDialog(null,"x1 = x2 = "+x1);
		}
		else {
			JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm !");
		}	
	}
	public static void giaiHpt2An(double a11, double a12, double a21, double a22,double b1, double b2) {
		double x,y;
		double D = a11*a22 - a12*a21;
		double Dx = b1*a22 - b2*a12;
		double Dy = b2*a11 - b1*a21;
		if(D==Dx && Dx==Dy)
			JOptionPane.showMessageDialog(null, "Hệ phương trình có vô số nghiệm");
		else if(D == 0) 
			JOptionPane.showMessageDialog(null, "Hệ phương trình vô nghiệm");
		else {
			x = Dx/D;
			y = Dy/D;
			JOptionPane.showMessageDialog(null, "x = "+x+"\ny = "+y);
		}
	}
	public static void main(String[] args) {
		String chucNang;
		do {
		 chucNang = JOptionPane.showInputDialog(null,
				 "1. Giải phương trình bậc 2 \n2.Giải hệ phương trình 2 biến\n3. Thoát",
				 "MENU",
				 JOptionPane.INFORMATION_MESSAGE
				 )
				 .trim();
		 if(chucNang.equals("1")) {
			 String strA,strB,strC;
			 double a,b,c;
			 try {
				 strA = JOptionPane.showInputDialog("Nhập a: ");
				 a = Double.parseDouble(strA.trim());
				 strB = JOptionPane.showInputDialog("Nhập b: ");
				 b = Double.parseDouble(strB.trim());
				 strC = JOptionPane.showInputDialog("Nhập c: ");
				 c = Double.parseDouble(strC.trim());
				 giaiPtBac2(a,b,c);
			 }catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Nhập Lỗi!");
				 continue;
			 }
		 }
		 else if(chucNang.equals("2")) {
			 String strA11, strA12, strA21, strA22, strB1, strB2;
			 double a11,a12,a21,a22,b1,b2;
			 try {
			 strA11 = JOptionPane.showInputDialog("Nhập a11: ");
			 a11 = Double.parseDouble(strA11);
			 
			 strA12 = JOptionPane.showInputDialog("Nhập a12: ");
			 a12 = Double.parseDouble(strA12);
			 
			 strA21 = JOptionPane.showInputDialog("Nhập a21: ");
			 a21 = Double.parseDouble(strA21);
			 
			 strA22 = JOptionPane.showInputDialog("Nhập a22: ");
			 a22 = Double.parseDouble(strA11);
			 
			 strB1 = JOptionPane.showInputDialog("Nhập b1: ");
			 b1 = Double.parseDouble(strB1);
			 
			 strB2 = JOptionPane.showInputDialog("Nhập b2: ");
			 b2 = Double.parseDouble(strB2);
			 giaiHpt2An(a11,a12,a21,a22,b1,b2);
			 }
			 catch(Exception e) {
				 JOptionPane.showMessageDialog(null,"Nhập lỗi !");
				 continue;
			 }
			 
		 }
		 
		}
		while(chucNang.equals("3")!=true);
		System.exit(0);
	}
	

}
