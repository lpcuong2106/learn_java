package buoi1;

public class hinhtron {

		public int R;
		
		public int getR() {
			return R;
		}

		public void setR(int r) {
			R = r;
		}
		
		public double chuvi() {
			return 2 * this.R * Math.PI;
		}
		public double dientich() {
			return Math.PI * Math.pow(getR(), 2);
		}
}
