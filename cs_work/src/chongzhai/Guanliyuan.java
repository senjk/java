/**
 * @author 程森
 *2017年8月16日上午11:30:29
 */
package chongzhai;
/**
 * 管理员   网站类
 * @author 程森
 *2017年8月16日上午11:30:29
 */
/**
 * 1.在同一个类中重载方法
 * 2. 方法名相同
 * 3.参数数据类型，顺序，个数不同
 * 4.与返回值访问修饰符无关
 */
public class Guanliyuan {
        String name;
        String quanxie;
        String date;
	public Guanliyuan(){
		this.name="王凯";
		this.quanxie="初级管理员";
		this.date="2017年5月12号";
	}
	public Guanliyuan( String name1,String quan,String date1){
		this.name=name1;
		this.quanxie=quan;
		this.date=date1;
	}
	public String show(){
		String str=name+"管理员\t管理权限为"+quanxie+"\t授权时间为："+date;
		return str;
	}
	
}
