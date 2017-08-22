/**
 * @author 程森
 *2017年8月17日下午2:35:39
 */
package duotai2;
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
 * 普通杯子
 * @author 程森
 *2017年8月17日下午2:35:39
 */
public class PutBeizi extends Beizi {

	@Override
	public String addwater() {
		String str="正在加水";
		return str;
	}

	@Override
	public String movewater() {
		String str="正在倒水";
		return str;
	}

	
	
}
