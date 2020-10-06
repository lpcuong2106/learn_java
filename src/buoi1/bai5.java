package buoi1;

import java.util.Scanner;

public class bai5 {
	public String tensach;
	public int soluong;
	public int gia;
	
	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}
	public float calculateGia() {
		return this.soluong * this.gia;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		bai5 sach = new bai5();
		System.out.println("Enter ten sach:");
		sach.setTensach(sc.nextLine());
		System.out.println("Enter so luong:");
		sach.setSoluong(sc.nextInt());
		System.out.println("Enter gia:");
		sach.setGia(sc.nextInt());
		System.out.format("Ten sach: %s\nTien phai tra =" + sach.calculateGia(), sach.getTensach());
		
	}
	
}
