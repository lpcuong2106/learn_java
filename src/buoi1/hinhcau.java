package buoi1;

public class hinhcau extends hinhtron{
	public double dientich() {
		return 4 * Math.PI * Math.pow(this.getR(), 2);
	}
	
	public double dientichmatcat() {
		return Math.PI * Math.pow(getR(), 2);
	}
	
	public double thetich() {
		return 4/3 * Math.PI * Math.pow(this.getR(), 3);
	}
}
