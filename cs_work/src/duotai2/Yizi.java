/**
 * @author 程森
 *2017年8月17日上午10:41:14
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
 *2017年8月17日上午10:41:14
 */
public class Yizi extends Yi implements Zhedieyi {

	/* (non-Javadoc)
	 * @see jiekou.Zhedieyi#zhed()
	 */
	@Override
	public String zhed() {
		String str="折叠中...\n折叠完成。";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.Zhedieyi#shifang()
	 */
	@Override
	public String shifang() {
		String str="释放中...\n释放完成。";
		return str;
	}

	@Override
	public String zuo() {
		String str="坐在椅子上";
		return str;
	}

}
