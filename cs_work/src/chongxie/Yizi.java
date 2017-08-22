/**
 * @author 程森
 *2017年8月16日下午10:51:37
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
 * 椅子 
 * @author 程森
 *2017年8月16日下午07:51:37
 */
public class Yizi extends Jiaju {
     public String show(){
    	 name="椅子";
    	 yanse="红";
    	 String str="这是一个"+this.yanse+"色的"+this.name;
   	  return str;
     }
}
