/**
 * @author 程森
 *2017年8月16日下午2:20:34
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
 *2017年8月16日下午2:20:34
 */
public class Xuesheng extends Xuexiao{
     public Xuesheng(String name ,String zhi){
    	 super(name,zhi);
     }
     public String print(){
     	String str=name+"的职位是"+zhiwei;
     	return str;
     }
}
