/**
 * @author 程森
 *2017年8月16日下午5:09:26
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
 *2017年8月17日上午8:09:26
 */
public class Drink {
      private String name;

      public String drink(){
    	
    	  String str="饮料好好喝！";
    	  return str;
      }
      
      
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
      
}
