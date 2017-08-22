/**
 * @author 程森
 *2017年8月14日下午2:50:58
 */
package trycatch;

import java.util.Scanner;

/**
 *  try catch finally
 *  什么时候不走finally
 * @author 程森
 *2017年8月14日下午2:50:58
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		try {
			
			System.out.println("请输入被除数：");
			int num1 = cin.nextInt();
			System.out.println("请输入除数：");
			int num2 = cin.nextInt();
			int num3 = num1 / num2;
			System.out.println(num3);
		} catch (Exception e) {
			System.err.println("出现异常");
			System.exit(1);
			e.printStackTrace();
		} finally {
			  System.out.println("欢迎使用本程序！");
				cin.close();	
	}
	}

}
