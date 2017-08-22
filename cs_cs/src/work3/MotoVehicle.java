package work3;
/**
 * 父类 车
 * @author 程森
 *2017年8月12日上午9:14:19
 */
public abstract class MotoVehicle {
      private int No;  //车牌号
      private String Color;
      private double Mileage;//里程数
      private String Brand;  //品牌
      
      public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getMileage() {
		return Mileage;
	}

	public void setMileage(double mileage) {
		Mileage = mileage;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public  abstract String CalcRent(int days);
}
