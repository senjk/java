/**
 * @author 程森
 *2017年8月16日上午11:50:06
 */
package chongzhai;
/**
 * 1.在同一个类中重载方法
 * 2. 方法名相同
 * 3.参数数据类型，顺序，个数不同
 * 4.与返回值访问修饰符无关
 */
/**
 * 
 * 游客 网站类
 * @author 程森
 *2017年8月16日上午11:50:06
 */
public class Youke {
	 String name;
     String date;
     
     public Youke(){
    	 this.name="程虎";
    	 this.date="2017/7/5";
     }
     public Youke(String n,String d){
    	 this.name=n;
    	 this.date=d;
     }
     public String show(){
    	 String str="游客名\t浏览时间\n"+name+"\t"+date;
    	 return str;
     }
}
