/**
 * @author 程森
 *2017年8月16日下午2:27:25
 */
package chongxie;
/**
 * 1.子类重写父类中的方法
 * 2.方法名相同
 * 3.参数列表相同
 * 4.返回值类型相同或是其子类
 * 5.访问权限不能严于父类
 */
/**
 * 宠物类  父类
 * @author 程森
 *2017年8月16日下午2:27:25
 */
public class Pet {
	   private String name;//昵称
	   private int love;//亲密度
	   
	   public String show( String name,int love){
		   String str="昵称\t亲密度\n"+this.name+"\t"+this.love;
		   return str;
	   }
	   
	   
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
