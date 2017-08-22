/**
 * @author 程森
 *2017年8月15日上午11:47:56
 */
package animal;

import java.util.Scanner;

/**
 * 动物测试类
 * @author 程森
 *2017年8月15日上午11:47:56
 */
public class Main {
	static Scanner cin=new Scanner(System.in);
     static Animal[] animals=new Animal[3];
     static String flag;
    
     public static void show(){
    	 int legNums=0;
    	 System.out.println("动物名称\t\t腿的条数\t\t动物叫");
    	 for(int i=0;i<3;i++){
    		 if(animals[i] instanceof Terr){
    			int legNum=((Terr)animals[i]).getLegNum();
    		 System.out.println(animals[i].getName()+"\t\t"+legNum+"\t\t"+animals[i].shout());
    		 }else{
    			 System.out.println(animals[i].getName()+"\t\t"+legNums+"\t\t"+animals[i].shout());
    		 }
    		 }
    	System.out.println("是否要修改数据：按0进行修改操作，其他字母退出");
    	
 			flag=cin.next();
		
    	 
     }
     public static void start(){
    	 animals[0]=new Cat("兰兰",4);
    	 animals[1]=new Duck("唐老鸭",2);
    	 animals[2]=new Penguin("琪琪");
    	 show();
    	
     }
     public static void mod() throws Exception{
    	  
    	  String[] names=new String[3];
    	  int[] num=new int[3];
    	  System.out.println("请输入猫的名称：");
    	  names[0]=cin.next();
    	  System.out.println("请输入猫的腿数：");
    	  num[0]=cin.nextInt();
    	  if(num[0]!=4){
    		  System.err.println("猫只能有4条腿");
    		  throw new Exception("");
    		
    	  }
    	  System.out.println("请输入鸭的名称：");
    	  names[1]=cin.next();
    	  System.out.println("请输入鸭的腿数：");
    	  num[1]=cin.nextInt();
    	  if(num[1]!=2){
    		  System.err.println("鸭只能有2条腿");
    		  throw new Exception("");
    	  }
    	  System.out.println("请输入海豚的名称：");
    	  names[2]=cin.next();
    	  
    	  animals[0]=new Cat(names[0],num[0]);
    	  animals[1]=new Duck(names[1],num[1]);
    	  animals[2]=new Penguin(names[2]);
    	  
     }
	public static void main() {
		start();
		while(flag.equals("0")){
				try {
					mod();
				} catch (Exception e) {
					
//					e.printStackTrace();
				}finally{
					show();
					
				}
			
		}
		System.out.println("感谢使用本程序");
	}


}
