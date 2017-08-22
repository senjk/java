package cs;

public class Gouzao3 {
    String name;
    String type;
    double num;
	String str;
	public Gouzao3(){
		name="无参3";
		type="普通";
		num=126;
	}
	public Gouzao3(String name3,String type3){
		name=name3;
		type=type3;
		num=12623;
	}
	public String hk(){
		 str="客户名称："+name+"\n"+"类型："+type+"\n"+"剩余积分："+num;
		 return str;
	}
}
