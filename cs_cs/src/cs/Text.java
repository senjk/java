package cs;

import java.util.Scanner;

/**
 * 
 * @author 程森
 *2017年8月8日上午10:07:11
 */

public class Text {
/**
 * 主函数
 * @param args
 */
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		// TODO Auto-generated method stub
  //调用函数
//		Lei llei =new Lei();
//		String str =llei.lei();
//		System.out.println(str);
//		School min=new School();
//		min.name="北大青鸟合肥一元";
//		min.num=15;
//		min.numm=9;
//		min.school();
		
		
		
		Custoromer lk=new Custoromer("str");
		
//		lk.name=cin.next();
//		
//		
//		lk.leixing=cin.next();
//		
//		lk.num=cin.nextDouble();
		String str =lk.show();
		System.out.println(str);
//		System.out.println("请输入");
//		String gh=cin.nextLine();
//		System.out.println("请输入");
//		String gl=cin.nextLine();
//		Lei kk=new Lei();
//		String str= kk.min(gh, gl);
//		System.out.println(str);
		cin.close();
		
	}

}
