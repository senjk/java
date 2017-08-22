package duotai;

import java.util.Scanner;

/**
 * 测试类
 * @author 程森
 *2017年8月11日下午8:29:31
 */
public class Test {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		// TODO Auto-generated method stub
		///多态形式1  父类作为形参
   Pet petss=new Dog();
//   String str=dog.eat();
//   System.out.println(str);
   Pet pets=new Penguin();
//   Penguin pen =new Penguin();
   Master master=new Master();
   String d=master.feed(petss);
   String p=master.feed(pets);
   System.out.println(d);
   System.out.println(p);
//   Pet pet=new Dog();
//   String strp=pet.eat();
//  System.out.println(strp);
   ///多态形式2
 
   ///多态形式2 父类做返回类型，子类做实例化对象
   System.out.println("请输入你要领养的宠物(1.狗狗 2.企鹅 3.猫)");
     int xz=cin.nextInt();
    Pet petsd= master.getPet(xz);
   System.out.println(petsd.eat());
  String sd= master.play(pets);
  System.out.println(sd);
   cin.close();
	}

}
