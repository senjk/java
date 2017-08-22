package fengzhuang;
/**
 * 属性类
 * @author 程森
 *2017年8月11日上午10:30:23
 */

public class Customer {
     private String name;
     private String type;
     private double num;
     public String customer( String names){
    	 String str="姓名"+names+"\n卡类型"+type+"\n积分"+num;
    	 return str;
    	 
     }
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;	
		
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
     
}
