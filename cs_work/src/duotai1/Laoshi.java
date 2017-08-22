/**
 * @author 程森
 *2017年8月17日上午11:54:59
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
 *2017年8月17日上午11:54:59
 */
public class Laoshi extends Xuexiao {

	public Laoshi(String name1, String zhiwei1) {
		super(name1, zhiwei1);
		// TODO Auto-generated constructor stub
	}
	 public String print(){
	     	String str=name+"的职位是"+zhiwei;
	     	return str;
	     }

}
