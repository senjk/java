/**
 * @author 程森
 *2017年8月17日上午11:16:15
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
 * 自动小车
 * @author 程森
 *2017年8月17日上午11:16:15
 */
public class Zicar implements Zidongjiashi {

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

}
