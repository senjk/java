/**
 * @author 程森
 *2017年8月17日上午8:37:44
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
 * 狮子子类
 * @author 程森
 *2017年8月17日上午8:37:44
 */
public class Lion extends Animal {
	

	/* (non-Javadoc)
	 * @see chouxiang.Animal#play(java.lang.String)
	 */
	@Override
	public String play(String name) {
		// TODO Auto-generated method stub
		 setName(name);
		   String str=getName()+"是狮子！";
		   return str;
	}

}
