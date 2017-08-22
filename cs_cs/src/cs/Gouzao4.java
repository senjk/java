package cs;

public class Gouzao4 {
String name;
String type;
String str;
double num;
public Gouzao4(){
	name="无参4";
	type="普通";
	num=10;
}
public Gouzao4(String fg){
	name=fg;
	type="VIP";
	num=1548;
}
public String gh(){
	 str="客户名称："+name+"\n"+"类型："+type+"\n"+"剩余积分："+num;
	 return str;
}
}
