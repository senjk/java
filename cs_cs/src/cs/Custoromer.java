package cs;


/**
 * 1.方法名相同
 * 2.参数数据类型，顺序，个数不同
 * 3.与返回值访问修饰符无关
 */
public class Custoromer {
  String name;
  String leixing;
  double num;
  String str;
  public Custoromer(){
	  name="王五";
	  leixing="VIP";
	  num=1258;
  }
  public Custoromer(String str){
	  name="赵四";
	  leixing="普通";
	  num=100;
  }
  public String show(){
	  str="客户名称："+name+"\n"+"卡类型："+leixing+"\n"+"剩余积分:"+num;
	  return str;
  }
}
