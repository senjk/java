/**
 * @author 程森
 *2017年8月17日上午10:50:06
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
 * 变频灯
 * @author 程森
 *2017年8月17日上午10:50:06
 */
public class Biandeng implements Bianhuan {

	/* (non-Javadoc)
	 * @see jiekou.Bianhuan#liang()
	 */
	@Override
	public String liang() {
		String str="人很多，加大功率，变亮了";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou.Bianhuan#an()
	 */
	@Override
	public String an() {
		String str="人很少，减小功率，变暗了";
		return str;
	}

}
