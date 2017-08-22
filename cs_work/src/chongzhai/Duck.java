/**
 * @author 程森
 *2017年8月16日上午11:59:14
 */
package chongzhai;


/**
 * @author 程森
 *2017年8月16日上午11:59:14
 */
/**
 * 1.在同一个类中重载方法
 * 2. 方法名相同
 * 3.参数数据类型，顺序，个数不同
 * 4.与返回值访问修饰符无关
 */
public class Duck {
     String name;
     public Duck(){
       this.name="小红";
     }
     public Duck(String name1){
         this.name=name1;
       }
     public String jiao(){
    	 String str=name+"嘎嘎叫";
    	 return str;
     }
}
