/**
 * @author 程森
 *2017年8月16日下午1:48:22
 */
package duotai1;
/**
 * 多态定义：
 * 同一个引用类型，使用不同的实例而执行不同的操作
 */
/**
 * 多态三要素：
 * 1.具有继承关系的子类和父类
 * 2.子类重写父类的方法
 * 3.使用父类的引用指向子类的对象
 */
/**
 * 狮子
 * @author 程森
 *2017年8月17日下午1:48:22
 */
public class Lion extends Animal{
	 public String plays(){
    	 String str="狮子在跑";
    	 return str;
     }
   public String play( String name){
	  setName(name);
	   String str=getName()+"是狮子！";
	   return str;
   }

   
}
