/**
 * @author 程森
 *2017年8月17日下午1:47:16
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
 * drink  公共类
 * @author 程森
 *2017年8月17日下午1:47:16
 */
public class Comom {
     public Drink getdrink(int id){
    	 Drink drink=null;
    	 if(id==1){
    		 drink=new Orangejuice();
    	 }else if(id==2){
    		 drink=new Kele();
    	 }
    	 return drink;
     }
     
     public String play(Animal am){
     	String str = null;
     	if(am instanceof Lion){
     		Lion lion=(Lion) am;
     		 str= lion.plays();
     	}
     	else if(am instanceof Brid){
     		Brid lion=(Brid) am;
    		 str= lion.plays();
     	}
     	else if(am instanceof Fish){
     		Fish lion=(Fish) am;
    		 str= lion.plays();
     	}
 		return str;
     }
}
