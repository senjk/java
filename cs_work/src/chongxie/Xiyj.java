/**
 * @author 程森
 *2017年8月16日下午5:28:32
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
 *2017年8月16日下午5:28:32
 */
public class Xiyj extends Wenxue {
     
	  public String fina(){
      	setName("西游记");
      	String str="我最爱看"+getName()+"了";
      	return str;
      }
}
