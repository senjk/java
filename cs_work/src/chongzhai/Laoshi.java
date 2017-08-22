package chongzhai;
/**
 * 1.在同一个类中重载方法
 * 2. 方法名相同
 * 3.参数数据类型，顺序，个数不同
 * 4.与返回值访问修饰符无关
 */
public class Laoshi {
	 public String name;
     public String jiaonum;//教师号
     public String ke;//所授课程
     public String show(String name1,String jiaonum1,String love){
   	  this.name=name1;
   	  this.jiaonum=jiaonum1;
   	  String str=name+"老师的教师编号为："+jiaonum+"\t爱好为："+love;
   	  return str;
     }
     public String show(String name1,String xuenum1,String love,String ke1){
   	  this.name=name1;
   	  this.jiaonum=xuenum1;
   	  this.ke=ke1;
   	  String str=name+"老师的教师编号为："+jiaonum+"\t爱好为："+love+"\t所授课程"+ke;
   	  return str;
     }
}