/**
 * 多态定义：
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 多态三要素：
 * 1.具有继承关系的子类和父类
 * 2.子类重写父类的方法
 * 3.使用父类的引用指向子类的对象
 * @author 程森
 *2017年8月17日上午10:18:11
 */
package duotai2;
/**
 * 多态定义：
 * 同一个引用类型，使用不同的实例而执行不同的操作
 * 多态三要素：
 * 1.具有继承关系的子类和父类
 * 2.子类重写父类的方法
 * 3.使用父类的引用指向子类的对象
 * @author 程森
 *2017年8月17日上午10:18:11
 */
public class Baowenbei extends Beizi implements Baowen {

	/* (non-Javadoc)
	 * @see jiekou.Baowen#baowen()
	 */
	@Override
	public String baowen() {
		String str="保温中...";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.Baowen#jinghua()
	 */
	@Override
	public String jinghua() {
		String str="净化水质";
		return str;
	}

	@Override
	public String addwater() {
		String str="保温杯正在加水";
		return str;
	}

	@Override
	public String movewater() {
		String str="保温杯正在倒水";
		return str;
	}

}
