/**
 * @author 程森
 *2017年8月17日上午10:30:35
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
 *2017年8月17日上午10:30:35
 */
public class Jinyh extends Flower implements Yaoyong {

	/* (non-Javadoc)
	 * @see jiekou.Yaoyong#yao()
	 */
	@Override
	public String yao() {
		String str="金银花有药用价值。";
		return str;
	}

	@Override
	public String qi() {
		String str="金银花很香";
		return str;
	}

}
