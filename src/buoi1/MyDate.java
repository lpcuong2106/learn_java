package buoi1;


import java.util.Date;
import java.util.Scanner;

public class MyDate {
	public int ngay;
	public int thang;
	public int nam;
	
	public int compare(MyDate mydate) {
		if(this.nam == mydate.nam) {
			if(this.thang == mydate.thang) {
				if(this.ngay == mydate.ngay) {
					return 0;
				}else if(this.ngay > mydate.ngay){
					return 1;
				}else {
					return -1;
				}
				
			}else if(this.thang > mydate.thang){
				return 1; 
			}else {
				return -1;
			}
			
		}else if(this.nam > mydate.nam) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}


	public static void main(String[] args) {
		System.out.println("Nhap ngay");
		Scanner sc = new Scanner(System.in);
		MyDate myDate = new MyDate();
		int ngay = sc.nextInt();
		myDate.setNgay(ngay);
		System.out.println("Nhap thang");
		int thang = sc.nextInt();
		myDate.setThang(thang);
		System.out.println("Nhap nam");
		int nam = sc.nextInt();
		myDate.setNam(nam);
		MyDate ortherDate = new MyDate();
		ortherDate.setNam(2020);
		ortherDate.setNgay(1);
		ortherDate.setThang(10);
		int result = myDate.compare(ortherDate);
		
		if(result > 0) {
			System.out.println("Lop hon");
		}else if(result < 0){
			System.out.println("nho hon");
		}else {
			System.out.println("bang");
		}
	}

}
