/**
 * @author 程森
 *2017年8月16日上午11:22:30
 */
package chongzhai;
/**
 * 1.在同一个类中重载方法
 * 2. 方法名相同
 * 3.参数数据类型，顺序，个数不同
 * 4.与返回值访问修饰符无关
 */
/**
 * 职工
 * @author 程森
 *2017年8月16日上午11:22:30
 */
public class Zhigong {
	      public String name;
	      public String num;//职工号
	      public String zhiwei;
	      public String show(String name1,String num1){
	    	  this.name=name1;
	    	  this.num=num1;
	    	  String str=name+"的职工号为："+num;
	    	  return str;
	      }
	      public String show(String name1,String num1,String zhi1){
	    	  this.name=name1;
	    	  this.num=num1;
	    	  this.zhiwei=zhi1;
	    	  String str=name+"的职工号为："+num+"\t职位为："+zhiwei;
	    	  return str;
	      }
}
