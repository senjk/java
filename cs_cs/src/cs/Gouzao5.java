package cs;

public class Gouzao5 {
	static String name;
	static String type;
	
	static double num;
	public Gouzao5(){
		name="无参5";
		type="普通";
		num=10;
	}
	public Gouzao5(String d,String l,double c ){
		name=d;
		type=l;
		num=c;
	}
	public static String fh(){
		name="无参5";
		type="普通";
		num=10;
		 String str="名称名称："+name+"\n"+"类型:"+type+"\n"+"剩余积分"+num;
		return str;
	}
}
