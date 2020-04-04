package dientichht;

public class DienTichHinhTron {
	private double r;
	
	public DienTichHinhTron() {
		
	}
	

	public DienTichHinhTron(double r) {
		this.r = r;
	}
	


	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}


	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}
	public String solve() {
		return r*r*3.14 + "";
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
