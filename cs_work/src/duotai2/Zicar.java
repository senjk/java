/**
 * @author 程森
 *2017年8月17日上午11:16:15
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
 * 自动小车
 * @author 程森
 *2017年8月17日上午11:16:15
 */
public class Zicar extends Car implements Zidongjiashi {

	/* (non-Javadoc)
	 * @see jiekou.Zidongjiashi#ziopen()
	 */
	@Override
	public String ziopen() {
		String str="正在打开无人驾驶";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.Zidongjiashi#zidaoh()
	 */
	@Override
	public String zidaoh() {
		String str="正在自动导航，寻找路线...";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.Zidongjiashi#zizuo()
	 */
	@Override
	public String zizuo() {
		String str="正在驾驶...";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.Zidongjiashi#ziclose()
	 */
	@Override
	public String ziclose() {
		String str="正在关闭无人驾驶";
		return str;
	}

	@Override
	public String kai() {
		String str="正在开车";
		return str;
	}

}
