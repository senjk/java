/**
 * @author 程森
 *2017年8月16日下午4:44:28
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
 * 公司  父类
 * @author 程森
 *2017年8月17日下午1:44:28
 */
public class Conpany {
     String name;
     String money;
     public String show(String names,String monets){
    	 this.name=names;
    	 this.money=monets;
    	 String str="公司名：\t注册资金：\n"+name+"\t"+money;
    	 return str;
     }
	
	
	
	
}
