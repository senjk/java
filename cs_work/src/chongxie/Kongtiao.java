/**
 * @author 程森
 *2017年8月16日下午11:20:23
 */
package chongxie;
/**
 * 1.子类重写父类中的方法
 * 2.方法名相同
 * 3.参数列表相同
 * 4.返回值类型相同或是其子类
 * 5.访问权限不能严于父类
 */
/**
 * @author 程森
 *2017年8月16日下午08:20:23
 */
public class Kongtiao extends Jiadian {
	  public String show(){
	    	 name="空调";
	    	 String str="这是一个"+this.name;
	   	  return str;
	     }
}
