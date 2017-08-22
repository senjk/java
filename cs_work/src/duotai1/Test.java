/**
 * @author 程森
 *2017年8月16日下午2:03:04
 */
package duotai1;

import java.util.Scanner;

/**
 * 测试类
 * @author 程森
 *2017年8月16日下午2:03:04
 */
public class Test {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		
		///1.  父类作为形参实现多态
	/**		Master st=new Master();
			System.out.println(st.feed(new Dog()));
			System.out.println(st.feed(new Cat()));
		
		*/
		
		
		///2.   父类作为返回类型实现多态
	/**	Comom am=new Comom();
		System.out.println("请输入1-2(1.橙汁   2.可乐)");
		int id=cin.nextInt();
		System.out.println(am.getdrink(id).drink());
		*/
		
		//3.  instanceof运算符
//		Comom am1=new Comom();
//		Animal an[]=new Animal[3];
//		an[1]=new Lion();
//		an[2]=new Fish();
//		an[0]=new Brid();
//		for(int i=0;i<an.length;i++){
//			 System.out.println(am1.play(an[i])); 
//		}
//      


		
//		//4.
//		Xuexiao jk;
//		jk=new Xuesheng("李刚", "学生");
//		System.out.println(jk.print());
//		jk=new Laoshi("李红", "教导主任");
//		System.out.println(jk.print());
		
	
		
		
		
		
		//5.
//		Conpany Ht=new Hongtuo();
//		System.out.println(Ht.show("宏拓", "85万"));
		
		
		//6.
//		Food gh=new Rice();
//		System.out.println(gh.cook("米饭"));
	
		
		
		//7.
//		Music hk=new Hktk();
//		System.out.println(hk.print());
		
		
		//8.
//	   Wenxue xyj=new Xiyj();
//		System.out.println( xyj.fina());
		
		//9.
//		Jiaju xyj=new Yizi();
//		System.out.println( xyj.show());
		
		//10.
		Jiadian xyj=new Kongtiao();
		System.out.println( xyj.show());
		cin.close();
	}

}
