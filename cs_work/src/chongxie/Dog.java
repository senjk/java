/**
 * @author 程森
 *2017年8月16日下午4:37:57
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
 * @author 程森
 *2017年8月16日下午4:37:57
 */
public class Dog extends Pet {

	
	
	
public String show(String name,int love){
	super.setName(name);
	super.setLove(love);
	 String str="昵称\t亲密度\n"+this.getName()+"\t"+this.getLove();
	   return str;
}
}
