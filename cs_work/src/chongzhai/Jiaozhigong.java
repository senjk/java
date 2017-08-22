/**
 * @author 程森
 *2017年8月16日下午12:49:18
 */
package chongzhai;

/**
 * 教职工  学校
 * @author 程森
 *2017年8月16日下午12:49:18
 */
/**
 * 1.在同一个类中重载方法
 * 2. 方法名相同
 * 3.参数数据类型，顺序，个数不同
 * 4.与返回值访问修饰符无关
 */
public class Jiaozhigong {
      String name;
      String work;
      public Jiaozhigong(){
    	  this.name="王先丽";
    	  this.work="食堂阿姨";
    	  
      }
      public Jiaozhigong(String name1,String work1){
    	  this.name=name1;
    	  this.work=work1;
    	  
      }
      public String show(){
    	  String str=name+"是"+work;
    	  return str;
      }
}
