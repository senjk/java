package cs;

public class Gouzao1 {
	String name;
	String type;
    double num;
	String str;
	public Gouzao1(){
		name="无参2";
		type="普通";
		num=154;
	}
	public Gouzao1(String nm){
		name=nm;
		type="Vip";
		num=1540;
	}
	public String jk1(){
		 str="客户名称："+name+"\n"+"类型："+type+"\n"+"剩余积分："+num;
		return str;
	}
}
