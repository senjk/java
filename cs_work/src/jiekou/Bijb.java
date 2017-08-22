/**
 * @author 程森
 *2017年8月17日上午10:05:04
 */
package jiekou;
/**
 * 1.接口不可以被实例化
 * 2.接口中的变量都是静态常量
 * 3.实现类必须实现接口的所有方法
 * 4.实现类可以实现多个接口
 * 
 */
/**
 * 接口有比抽象类更好的特性
 * 1.可以被多实现
 * 2.设计和实现完全分离
 * 3.更自然的使用多态
 * 4.更容易搭建程序框架
 * 5.更容易更换实现
 */
/**
 * @author 程森
 *2017年8月17日上午10:05:04
 */
public class Bijb implements Bjb {

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

}