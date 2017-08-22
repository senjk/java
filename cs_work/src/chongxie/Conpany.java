/**
 * @author 程森
 *2017年8月16日下午4:44:28
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
 * 公司  父类
 * @author 程森
 *2017年8月16日下午4:44:28
 */
public class Conpany {
     String name;
     String money;
     public String show(String names,String monets){
    	 this.name=names;
    	 this.money=monets;
    	 String str="公司名：\t注册资金：\n"+name+"\t"+money;
    	 return str;
     }
	
	
	
	
}
