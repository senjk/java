/**
 * @author 程森
 *2017年8月17日上午8:42:59
 */
package chouxiang;

/**
 * @author 程森
 *2017年8月17日上午8:42:59
 */
/**
 * 1.抽象类不能被实例化
 * 2.抽象类可以有0-多个抽象方法
 * 3.非抽象子类必须重写父类的所有抽象方法
  * 4.抽象方法没有方法体
 * 5.抽象方法必须在抽象类中
 * 
 */
public class Dog extends Pet {

	/* (non-Javadoc)
	 * @see chouxiang.Pet#show(java.lang.String, int)
	 */
	@Override
	public String show(String name, int love) {
		
		setName(name);
		setLove(love);
			 String str="昵称\t亲密度\n"+getName()+"\t"+getLove();
			   return str;
		}
	

}
