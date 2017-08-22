/**
 * @author 程森
 *2017年8月17日上午9:17:24
 */
package chouxiang;
/**
 * 1.抽象类不能被实例化
 * 2.抽象类可以有0~多个抽象方法
 * 3.非抽象子类必须重写父类的所有抽象方法
 * 4.抽象方法没有方法体
 * 5.抽象方法必须在抽象类中
 * 
 */
/**
 * @author 程森
 *2017年8月17日上午9:17:24
 */
public class Tv extends Jiadian {

	/* (non-Javadoc)
	 * @see chouxiang.Jiadian#open()
	 */
	@Override
	public String open() {
		String str="打开电视";
		return str;
	}

	/* (non-Javadoc)
	 * @see chouxiang.Jiadian#close()
	 */
	@Override
	public String close() {
		String str="关闭电视";
		return str;
	}

}
