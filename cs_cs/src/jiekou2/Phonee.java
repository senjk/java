package jiekou2;

public class Phonee {
	// TODO Auto-generated method stub
	CommonHandset hs=new CommonHandset("诺基亚","普通机");
	
  String str1=  hs.call();
  String str2= hs.sendinfo();
  String str3= hs.play("青藏高原");
  String str4= hs.info();
  public String show(){
	  String str=str1+"\n"+str2+"\n"+str3+"\n"+str4;
	  return str;
	  
  }
 
 
    Phone hs2=new Phone("华为", "智能机");
 
    String str5= hs2.call();
    String str6= hs2.sendinfo();
    String str7=hs2.networkConn();
    String str8= hs2.play("Let it go");
    String str9= hs2.takephotos();
    String str0= hs2.info();
    public String show1(){
  	  String str=  str5+"\n"+str6+"\n"+str7+"\n"+str8+"\n"+str9+"\n"+str0;
  	  return str;
  	  
    }
  
}
