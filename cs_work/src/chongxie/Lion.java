/**
 * @author 程森
 *2017年8月16日下午1:48:22
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
 * 狮子
 * @author 程森
 *2017年8月16日下午1:48:22
 */
public class Lion extends Animal{
 
   public String play( String name){
	   super.setName(name);
	   String str=super.getName()+"是狮子！";
	   return str;
   }

   
}
