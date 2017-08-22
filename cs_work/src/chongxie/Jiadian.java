/**
 * @author 程森
 *2017年8月16日下午11:18:57
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
 * 家电
 * @author 程森
 *2017年8月16日下午08:18:57
 */
public class Jiadian {
	 String name;
    
     public String show(){
   	  String str="这是一个"+this.name;
   	  return str;
   	  
     }
}
