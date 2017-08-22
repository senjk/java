/**
 * @author 程森
 *2017年8月17日下午3:33:20
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
 *2017年8月17日下午3:33:20
 */
public class Gudingdn extends Computer{

	@Override
	public String playmusic() {
		String str="播放音乐";
		return str;
	}

}
