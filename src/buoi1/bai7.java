package buoi1;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		hinhtron hc = new hinhtron();
		System.out.println("Enter ban kinh:");
		hc.setR(sc.nextInt());
		System.out.format("Ban kinh: " + hc.getR() + "Dien tich: " + hc.dientich());
		
	}

}
