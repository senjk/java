/**
 * @author 程森
 *2017年8月14日下午2:26:59
 */
package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * try catch
 * @author 程森
 *2017年8月14日下午2:26:59
 */
public class Test2 {
	private static Logger logger=Logger.getLogger(Test2.class.getName());
       public static void divid(){
    	   try {
			Scanner cin =new Scanner(System.in);
			   System.out.println("请输入被除数：");
				int num1 = cin.nextInt();
				logger.debug("输入第一个整数"+num1 );
				System.out.println("请输入除数：");
				int num2 = cin.nextInt();
				logger.debug("输入第一个整数"+num2 );
				int num3 = num1 / num2;
				String str=String.format("%d/%d=%d", num1,num2,num1/num2);
				logger.debug("输出结果："+str );
				System.out.println(num3);
				cin.close();
		}catch(InputMismatchException e){
			logger.error(e.getMessage()+"输入不匹配");
		}
    	   catch(ArithmeticException e){
    		   logger.error(e.getMessage()+"除数不能为0");
    	   } 
    	   catch (Exception e) {
			
			e.printStackTrace();
		}	
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divid();

       
	}

}
