/**
 * @author 程森
 *2017年8月16日下午10:51:37
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
 * 椅子 
 * @author 程森
 *2017年8月17日下午2:51:37
 */
public class Yizi extends Jiaju {
     public String show(){
    	 name="椅子";
    	 yanse="红";
    	 String str="这是一个"+this.yanse+"色的"+this.name;
   	  return str;
     }
}
