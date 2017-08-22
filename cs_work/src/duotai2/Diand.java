/**
 * @author 程森
 *2017年8月17日下午3:03:40
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
 * 点灯
 * @author 程森
 *2017年8月17日下午3:03:40
 */
public class Diand extends Deng {

	@Override
	public String open() {
		String str="打开电灯";
		return str;
	}

	@Override
	public String close() {
		String str="关闭电灯";
		return str;
	}

}
