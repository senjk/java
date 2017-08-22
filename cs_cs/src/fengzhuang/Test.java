package fengzhuang;

import java.util.Scanner;

/**
 * 测试类
 * @author 程森
 *2017年8月11日上午8:43:27
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner cin=new Scanner(System.in);
	   Dog dog1=new Dog( "gougou","拉布拉多犬");
	   Penguin pen =new Penguin();
	System.out.println("请输入你要领养的宠物名称：");
	   String name=cin.next();
	   System.out.println("请选择你养领养的宠物类别：(1.狗狗 2.企鹅)");
	  int leibie=cin.nextInt();
	   if(leibie==1){
//	   dog1.setName(name);
	   
//	   System.out.println("请选择狗狗的品种：(1.聪明的拉布拉多犬2.酷酷的雪纳瑞)");
//		 int strain=cin.nextInt();
//		 String dd="聪明的拉布拉多犬";
//		 String xnr="酷酷的雪纳瑞";
//		 if(strain==1){
//		  dog1.setStrain(dd);}
//		 else{
//			 dog1.setStrain(xnr);
//		 }
	   System.out.println("请输入狗狗的健康值：(1-100之间)");
		  int health=cin.nextInt();
		  dog1.setHealth(health);
		  System.out.println("请输入与宠物的亲密度：");
		  int love=cin.nextInt();
		  dog1.setLove(love);
		  String str=dog1.dog();
		  System.out.println(str);
	   }
	   else{
	   pen.setName(name);
	   System.out.println("请选择企鹅的性别：(1.Q仔2.Q妹)");
		 int strain=cin.nextInt();
		
		
		 if(strain==1){
		  pen.setSex(Penguin.getSexMale());
		  }
		 else{
			  pen.setSex(Penguin.getSexFemale());
		 }
	   System.out.println("请输入企鹅的健康值：(1-100之间)");
		  int health=cin.nextInt();
		 pen.setHealth(health);
		  System.out.println("请输入与宠物的亲密度：");
		  int love=cin.nextInt();
		 pen.setLove(love);
		  String str=pen.penguin();
		  System.out.println(str);
	   }
	   
	  cin.close();
	}

}
