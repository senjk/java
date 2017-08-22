/**
 * @author 程森
 *2017年8月16日下午4:37:57
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
 * @author 程森
 *2017年8月17日上午10:37:57
 */
public class Dog extends Pet {

	
	
	 public String eat(){
		   String str="狗吃狗粮";
		   return str;
	   }
public String show(String name,int love){
	super.setName(name);
	super.setLove(love);
	 String str="昵称\t亲密度\n"+this.getName()+"\t"+this.getLove();
	   return str;
}
}
