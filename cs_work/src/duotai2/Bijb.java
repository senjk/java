/**
 * @author 程森
 *2017年8月17日上午10:05:04
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
 *2017年8月17日上午10:05:04
 */
public class Bijb extends Computer implements Bjb {

	/* (non-Javadoc)
	 * @see jiekou.Bjb#move()
	 */
	@Override
	public String move() {
		String str="移动笔记本";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.Bjb#stop()
	 */
	@Override
	public String stop() {
		String str="放下笔记本";
		return str;
		}

	@Override
	public String playmusic() {
		String str="笔记本播放音乐";
		return str;
	}

}
