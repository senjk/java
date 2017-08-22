/**
 * @author 程森
 *2017年8月16日下午10:46:12
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
 * 
 * 家具类  父类
 * @author 程森
 *2017年8月16日下午08:46:12
 */
public class Jiaju {
      String name;
      String yanse;
      public String show(){
    	  String str="这是一个"+this.yanse+"色的"+this.name;
    	  return str;
    	  
      }
}
