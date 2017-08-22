/**
 * @author 程森
 *2017年8月12日上午9:55:06
 */
package work3;

import java.util.Scanner;

/**
 * 测试类
 * @author 程森
 *2017年8月12日上午9:55:06
 */
public class Test {

	public static void main(String[] args) {
		Scanner cin= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("请输入车牌号");
		int no=cin.nextInt();
		System.out.println("请输入车型(1-5)");
		int type=cin.nextInt();
		if(type<4&&type>0){
			  System.out.println("你租借的是小轿车");
			  Car car=new Car(no,type);
			  System.out.println("请输入租借天数：");
			  int days=cin.nextInt();
		      System.out.println( car.CalcRent(days));
		}
		else if(type>3&&type<6){
			System.out.println("你租借的是卡车");
			System.out.println("请输入座位数：");
			int set=cin.nextInt();
			Bus bus =new Bus(no,set);
			System.out.println("请输入租借天数：");
		    int days=cin.nextInt();
		    System.out.println( bus.CalcRent(days));
		}
		cin.close();
     
	}

}
