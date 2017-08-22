/**
 * @author 程森
 *2017年8月16日下午1:36:08
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
 * 父类  动物类
 * @author 程森
 *2017年8月17日上午9:36:08
 */
public class Animal {
	private String name;
     public String play(String name){
    	 setName(name);
    	 String str=getName()+"是动物！";
    	 return str;
     }
     public String plays(){
    	 String str="动物在跑";
    	 return str;
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
