/**
 * @author 程森
 *2017年8月17日上午8:52:39
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
 * 红楼梦
 * @author 程森
 *2017年8月17日上午8:52:39
 */
public class Honglm extends Wenxue {

	/* (non-Javadoc)
	 * @see chouxiang.Wenxue#fina()
	 */
	@Override
	public String fina() {
		setName("红楼梦");
		setPerson("林黛玉");
      	String str="我最爱看"+getName()+"了，最喜欢里面的"+getPerson();
      	return str;
	}

}
