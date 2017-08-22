/**
 * @author 程森
 *2017年8月16日上午10:41:47
 */
package chongzhai;

/**
 * 学生     学校类
 * @author 程森
 *2017年8月16日上午10:41:47
 */



/**
 * 1.在同一个类中重载方法
 * 2. 方法名相同
 * 3.参数数据类型，顺序，个数不同
 * 4.与返回值访问修饰符无关
 */
public class Xuesheng {
      public String name;
      public String xuenum;//学号
      public String show(String name1,String xuenum1){
    	  this.name=name1;
    	  this.xuenum=xuenum1;
    	  String str=name+"同学的学号为："+xuenum;
    	  return str;
      }
      public String show(String name1,String xuenum1,String love){
    	  this.name=name1;
    	  this.xuenum=xuenum1;
    	  String str=name+"同学的学号为："+xuenum+"\t爱好为："+love;
    	  return str;
      }
}
