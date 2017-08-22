/**
 * @author 程森
 *2017年8月17日上午8:41:25
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
 * 宠物
 * @author 程森
 *2017年8月17日上午8:41:25
 */
public abstract class Pet {
	 private String name;//昵称
	   private int love;//亲密度
	   
	   public abstract String show( String name,int love);
		 
	  
	   
	   
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
