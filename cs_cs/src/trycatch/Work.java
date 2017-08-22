/**
 * @author 程森
 *2017年8月14日下午3:03:55
 */
package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author 程森
 *2017年8月14日下午3:03:55
 */
public class Work {
	public static void main(String[] args) {
		 Scanner cin = new Scanner(System.in);
	   try {
		  
		    System.out.println("请输入您的选择(1-3)");
		//  1）输入的不是整数 2)输入的不是1-3的整数
		   int num1=cin.nextInt();
		switch(num1){
		   case 1:
			   System.out.println("C#");
			   break;
		   case 2:
			   System.out.println("java");
			   break;
		   case 3:
			   System.out.println("html");
			   break;
			   default :
				   System.err.println("输入的不是1-3范围");
			   break;
			   
		   }
	} catch(InputMismatchException ime){
		System.err.println("输入的不是整数");
		System.exit(1);
	}
	   catch (Exception e) {
		
		e.printStackTrace();
	}
	   finally {
		cin.close();
		System.err.println("欢迎提出建议");
	}
	
	}

}
