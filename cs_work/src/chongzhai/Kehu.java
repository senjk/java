/**
 * @author 程森
 *2017年8月16日上午11:09:33
 */
package chongzhai;

/**
 * 
 * 客户  公司类
 * @author 程森
 *2017年8月16日上午11:09:33
 */
/**
 * 1.在同一个类中重载方法
 * 2. 方法名相同
 * 3.参数数据类型，顺序，个数不同
 * 4.与返回值访问修饰符无关
 */
public class Kehu {
	  String name;
	  String leixing;
	  double num;
	  public String show(String name1,String lei1){
		  this.name=name1;
		  this.leixing=lei1;
		 String str="客户名称：\t卡类型\n"+name+"\t"+leixing;
		  return str;
	  }
	  public String show(String name1,String lei1,double n){
		  this.name=name1;
		  this.leixing=lei1;
		  this.num=n;
		 String str="客户名称：\t卡类型：\t剩余积分:\n"+name+"\t"+leixing+"\t"+num;
		  return str;
	  }
	
	
	
}
