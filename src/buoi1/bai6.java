package buoi1;

import java.util.Scanner;

public class bai6 extends bai5{
	
	public Boolean isStudent;
	
	public float calculateGia() {
		if(this.isStudent) {
			return (float)(this.soluong * this.gia * 0.9);
		}else {
			return (float)(this.soluong * this.gia);
			
		}
	} 
	
	public Boolean getIsStudent() {
		return isStudent;
	}

	public void setIsStudent(Boolean isStudent) {
		this.isStudent = isStudent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		bai6 sach = new bai6();
		System.out.println("Enter ten sach:");
		sach.setTensach(sc.nextLine());
		System.out.println("Enter so luong:");
		sach.setSoluong(sc.nextInt());
		System.out.println("Enter gia:");
		sach.setGia(sc.nextInt());
		System.out.println("ban co phai sv khong? Y or N");
		if(sc.next().charAt(0) == 'Y') {
//			System.out.println("La sv");
			sach.setIsStudent(true);
		}else {
			sach.setIsStudent(false);
		}
		
		System.out.format("Ten sach: %s\nTien phai tra =" + sach.calculateGia(), sach.getTensach());
		
	}

}
