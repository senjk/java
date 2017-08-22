/**
 * @author 程森
 *2017年8月16日下午2:27:25
 */
package duotai1;
/**
 * 多态定义：
 * 同一个引用类型，使用不同的实例而执行不同的操作
 */
/**
 * 多态三要素：
 * 1.具有继承关系的子类和父类
 * 2.子类重写父类的方法
 * 3.使用父类的引用指向子类的对象
 */
/**
 * 宠物类  父类
 * @author 程森
 *2017年8月17日下午2:27:25
 */
public class Pet {
	   private String name;//昵称
	   private int love;//亲密度
	   public String eat(){
		   String str="pet正在吃";
		   return str;
	   }
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
