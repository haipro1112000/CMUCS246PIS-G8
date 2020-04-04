package dientichhcn;



public class Control {
	private double dai,rong;
	
    /**
	 * 
	 */
	public Control() {
		
	}
	/**
	 * @param dai
	 * @param rong
	 */
	public Control(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	/**
	 * @return the dai
	 */
	public double getDai() {
		return dai;
	}
	/**
	 * @param dai the dai to set
	 */
	public void setDai(double dai) {
		this.dai = dai;
	}
	/**
	 * @return the rong
	 */
	public double getRong() {
		return rong;
	}
	/**
	 * @param rong the rong to set
	 */
	public void setRong(double rong) {
		this.rong = rong;
	}
	public String sovle(){      //tinh dien tich hinh chu nhat
        return String.valueOf(dai*rong);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control a = new Control(2,3);
		System.out.println(a.sovle());

	}

}
