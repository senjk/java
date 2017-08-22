/**
 * @author 程森
 *2017年8月14日下午1:47:10
 */
package trycatch;

import java.util.Scanner;

/**
 * 异常
 * @author 程森
 *2017年8月14日下午1:47:10
 */
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin =new Scanner(System.in);
		System.out.println("请输入被除数：");
		int num1=0;
		if(cin.hasNextInt()){
			num1=cin.nextInt();
			
		}else{
			System.err.println("输入的被除数不是整数，程序退出");
			System.exit(1);
		}
		System.out.println("请输入除数：");
		int num2=0;
		if(cin.hasNextInt()){
			num2=cin.nextInt();
			if(0==num2){
				System.err.println("输入的除数为0，程序退出");
				System.exit(1);
			}else{
				 int num3=num1/num2;
			      System.out.println(num3);
			}
			
		}else{
			System.err.println("输入的除数不是整数，程序退出");
			System.exit(1);
		}
      
        System.out.println("欢迎使用本程序！");
		cin.close();

	}

}
