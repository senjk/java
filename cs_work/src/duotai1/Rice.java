/**
 * @author 程森
 *2017年8月16日下午5:05:14
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
 * @author 程森
 *2017年8月17日下午2:05:14
 */
public class Rice extends Food {
       
	
	public String cook(String names){
		super.name=names;
		  String str=name+"慢慢烧";
    	  return str;
	}
}
