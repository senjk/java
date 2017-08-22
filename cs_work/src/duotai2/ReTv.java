/**
 * @author 程森
 *2017年8月17日上午9:41:54
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
 * 智能电视
 * @author 程森
 *2017年8月17日上午9:41:54
 */
public class ReTv extends Tv implements Tvs {

	/* (non-Javadoc)
	 * @see jiekou.Tvs#guangbo()
	 */
	@Override
	public String guangbo() {
		String str="收听广播";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.Tvs#playgame()
	 */
	@Override
	public String playgame() {
		String str="打游戏";
		return str;
	}

	@Override
	public String watch1() {
			String str="看电视";
			return str;
		}




	
}
