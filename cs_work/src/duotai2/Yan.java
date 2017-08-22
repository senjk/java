/**
 * @author 程森
 *2017年8月17日上午11:08:34
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
 *2017年8月17日上午11:08:34
 */
public class Yan extends Yand implements Luzui {

	/* (non-Javadoc)
	 * @see jiekou.Luzui#guo()
	 */
	@Override
	public String guo() {
		String str="加滤嘴...无害";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.Luzui#buguo()
	 */
	@Override
	public String buguo() {
		String str="不加滤嘴...有害";
		return str;
	}

	@Override
	public String chou() {
		String str="抽烟";
		return str;
	}

}
