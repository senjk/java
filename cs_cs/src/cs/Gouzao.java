package cs;

public class Gouzao {
   String name;
   String type;
   double num;
   String str;
   public Gouzao(){
	   name="王朝";
	   type="VIP";
	   num=1260;
   }
   public Gouzao(String names){
	   name=names;
	   type="VIP";
	   num=1260;
   }
   public String kj(){
	   
	   str="客户名称："+name+"\n"+"类型："+type+"\n"+"剩余积分："+num;
	   return str;
   }
}
