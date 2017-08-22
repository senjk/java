/**
 * @author 程森
 *2017年8月15日上午11:21:33
 */
package animal;

/**
 * 父类 动物类
 * @author 程森
 *2017年8月15日上午11:21:33
 */
public abstract class Animal {
   private String name=null;
   public Animal(String name){
	  this.name=name;
	   
   }
   public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public abstract String shout();



}
