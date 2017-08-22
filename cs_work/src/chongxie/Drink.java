/**
 * @author 程森
 *2017年8月16日下午5:09:26
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
 *2017年8月16日下午5:09:26
 */
public class Drink {
      private String name;

      public String drink(String names){
    	  setName(names);
    	  String str=getName()+"好好喝！";
    	  return str;
      }
      
      
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
      
}
