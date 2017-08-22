package jicheng;
/**
 * 学校
 * @author 程森
 *2017年8月11日下午4:30:35
 */

public class Xuexiao {
     private String code="0";//编码
     private String name;//名称
     private String sex;//性别
     private String age;//年龄
     
     
     public Xuexiao(){
    	 
     }
    public String strs(){
    	 return code;
     }
     
     
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
     
     
}
