/**
 * @author 程森
 *2017年8月18日下午4:33:00
 */
package gh;


import java.util.Scanner;

/**
 * @author 程森
 *2017年8月18日下午4:33:00
 */
public class Test {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int[] c=new int[5];
		System.out.println("请输入第一个成绩：");
		c[0]=cin.nextInt();
		System.out.println("请输入第二个成绩：");
		c[1]=cin.nextInt();
		System.out.println("请输入第三个成绩：");
		c[2]=cin.nextInt();
		System.out.println("请输入第四个成绩：");
		c[3]=cin.nextInt();
		System.out.println("请输入第五个成绩：");
		c[4]=cin.nextInt();
		for(int i=0;i<c.length;i++){
			System.out.println("输出第"+(i+1)+"个成绩为："+c[i]);
		}
		
		cin.close();
	}

}
