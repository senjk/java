/**
 * @author 程森
 *2017年8月12日下午4:37:19
 */
package jiekou2;

/**
 * 手机
 * @author 程森
 *2017年8月12日下午4:37:19
 */
public abstract class Handset {
      private String brand;//品牌
      private String type;  //类型
      
      public abstract String sendinfo();
      public abstract String info();//描述手机
      public abstract String call();//打电话
    
      public Handset(String brand ,String type){
    	  this.brand=brand;
    	  this.type=type;
      }
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
      
}
