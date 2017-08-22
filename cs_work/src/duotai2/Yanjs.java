/**
 * @author 程森
 *2017年8月17日上午10:27:24
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
 * 眼镜蛇
 * @author 程森
 *2017年8月17日上午10:27:24
 */
public class Yanjs extends Snake  implements Dushe {

	/* (non-Javadoc)
	 * @see jiekou.Dushe#du()
	 */
	@Override
	public String du() {
		String str="中毒了";
		return str;
	}

	@Override
	public String eat() {
		String str="蛇咬人";
		return str;
	}

}
