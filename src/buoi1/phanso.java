package buoi1;

import java.util.Scanner;

public class phanso {
	public int tuso;
	public int mauso;
	
	public int getTuso() {
		return tuso;
	}
	public void setTuso(int tuso) {
		this.tuso = tuso;
	}
	public int getMauso() {
		return mauso;
	}
	public void setMauso(int mauso) {
		this.mauso = mauso;
	}
	public void inPhanSo() {
		if(mauso == 1) {
			System.out.println("Phan so: " + this.tuso);
		}else {
			System.out.println("Phan so: " + tuso + "/" + this.mauso);
		}
	}
	public int UCLN(int a, int b) {
		if(b == 0) return a;
		return UCLN(b, a % b);
	}
	public void toiGian() {
		System.out.println("Phan so toi gian: " + this.mauso/UCLN(this.tuso, this.mauso) + "/" + this.tuso/UCLN(this.tuso, this.mauso));
//		System.out.println("uoc chung lon nhat" +  UCLN(this.tuso, this.mauso));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu so:");
		phanso ps = new phanso();
		ps.setTuso(sc.nextInt());
		System.out.println("Nhap mau so:");
		ps.setMauso(sc.nextInt());
		ps.inPhanSo();
		ps.toiGian();
	}

}
