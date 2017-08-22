/**
 * @author 程森
 *2017年8月17日上午10:10:07
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
 * @author 程森
 *2017年8月17日上午10:10:07
 */
public class Kongt extends Kti implements KT {

	/* (non-Javadoc)
	 * @see jiekou.KT#timeopen()
	 */
	@Override
	public String timeopen() {
		String str="正在打开...";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.KT#timeclose()
	 */
	@Override
	public String timeclose() {
		String str="正在关闭...";
		return str;
	}

	@Override
	public String open() {
		String str="打开空调";
		return str;
	}

	@Override
	public String close() {
		String str="关闭空调";
		return str;
	}

}
