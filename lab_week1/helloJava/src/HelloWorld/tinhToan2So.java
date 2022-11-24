package HelloWorld;

import javax.swing.JOptionPane;

public class tinhToan2So {

	public static void main(String[] args) {
		String sNumber1, sNumber2;
		double dNumber1 = 0,dNumber2 = 0;
		sNumber1 = JOptionPane.showInputDialog("nhập số thứ nhất: ");
		sNumber2 = JOptionPane.showInputDialog("nhập số thứ 2: ");
		try {
			dNumber1 = Double.parseDouble(sNumber1);
			dNumber2 = Double.parseDouble(sNumber2);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Nhập lỗi!", "Thông báo", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		Object[] option = {"+","-","*","/"};
		int phepTinh = JOptionPane.showOptionDialog(null, "Chọn phép tính", "Choose an option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, "+");
		switch(phepTinh) {
		case 0:
			JOptionPane.showMessageDialog(null, "Kết quả: " + (dNumber1 + dNumber2));
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Kết quả: " + (dNumber1 - dNumber2));
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Kết quả: " + (dNumber1 * dNumber2));
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Kết quả: " + (dNumber1 / dNumber2));
			break;
		}
		System.exit(0);
	}
}
