package ngayTrongThang;
import java.util.Scanner;
public class NgayTrongThang {

	public static boolean checkYear(int year) 
	{ 
	    
	    if (year % 400 == 0) 
	        return true; 
	    if (year % 4 == 0 && year % 100 != 0) 
	        return true;
	    return false; 
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] day31 = {"January","Match",
						"May","July",
						"August","October",
						"December",
						"Jan.","Mar.","May",
						"July","Aug.",
						"Oct.","Dec",
						"Jan","Mar","May",
						"July","Aug",
						"Oct","Dec",
						"1","3","5","7","8","10","12"};
		String[] day30 = {
				"April","June","September","November",
				"Apr.","June","Sept.","Nov.",
				"Apr","Jun","Sep","Nov",
				"4","6","9","11"};
		String[] thang2 = {"February","Feb.","Feb","2"};
		System.out.print("Nhập tháng: ");
		String thang = sc.next().trim();
		boolean check = true;
		for(int i =0;i<day31.length;i++)
			if(thang.equals(day31[i].trim())) check = false;
		for(int i =0;i<day30.length;i++)
			if(thang.equals(day30[i].trim())) check = false;
		for(int i =0;i<thang2.length;i++)
			if(thang.equals(thang2[i].trim())) check = false;
		if(check) {
			System.out.print("Nhập lỗi! ");
			System.exit(0);
		}
		System.out.print("\nNhập năm: ");
		String strNam = sc.next().trim();
		if(strNam.length()!=4) {
			System.out.print("Nhập lỗi! ");
			System.exit(0);
		}
		int iNam=0;
		try {
			iNam = Integer.parseInt(strNam);
		}catch(Exception e) {
			System.out.print("Nhập lỗi! ");
			System.exit(0);
		}
		for(int i =0;i<day31.length;i++)
			if(thang.equals(day31[i].trim())) System.out.print("Tháng này có 31 ngày");
		for(int i =0;i<day30.length;i++)
			if(thang.equals(day30[i].trim())) System.out.print("Tháng này có 30 ngày");
		for(int i =0;i<thang2.length;i++) {
			if(thang.equals(thang2[i].trim())&& checkYear(iNam)) 
				System.out.print("Tháng này có 29 ngày.");
			else if(thang.equals(thang2[i].trim())) System.out.print("Tháng này có 28 ngày");
		}
	}

}
