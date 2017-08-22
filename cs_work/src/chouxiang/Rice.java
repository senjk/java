/**
 * @author 程森
 *2017年8月17日上午8:48:05
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
 *2017年8月17日上午8:48:05
 */
public class Rice extends Food {

	/* (non-Javadoc)
	 * @see chouxiang.Food#cook(java.lang.String)
	 */
	@Override
	public String cook(String names) {
		// TODO Auto-generated method stub
		setName(names);
		  String str=getName()+"慢慢烧";
  	      return str;
	}

}
