/**
 * @author 程森
 *2017年8月16日上午9:53:16
 */
package chongzhai;

/**
 * 猫   重载 
 * @author 程森
 *2017年8月16日上午9:53:16
 */

/**
 * 1.在同一个类中重载方法
 * 2. 方法名相同
 * 3.参数数据类型，顺序，个数不同
 * 4.与返回值访问修饰符无关
 */

public class Cat {
	   public String name;
	   public  String Sex;
	
	public String eat(){
		String str="小猫吃猫粮！";
		return str;
	}
	public String eat(String names, String sexs){
		this.name=names;
		this.Sex=sexs;
		String str=name+"是只小"+Sex+"猫。正在吃猫粮！";
		return str;
	}

}
