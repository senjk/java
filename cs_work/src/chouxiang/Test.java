/**
 * @author 程森
 *2017年8月17日上午8:38:46
 */
package chouxiang;
/**
 * 1.抽象类不能被实例化
 * 2.抽象类可以有0~多个抽象方法
 * 3.非抽象子类必须重写父类的所有抽象方法
 * 4.抽象方法没有方法体
 * 5.抽象方法必须在抽象类中
 * 
 */


/**
 * 测试类
 * @author 程森
 *2017年8月17日上午8:38:46
 */
public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
//		Dog dog=new Dog();
//		System.out.println(dog.show("旺财", 85));

		//2.
//		Lion li=new Lion();
//	    System.out.println(li.play("莱恩"));
		
		
		//3.
//		Rice gh=new Rice();
//		System.out.println(gh.cook("米饭"));
		
		//4.
//		Honglm xyj=new Honglm();
//		System.out.println( xyj.fina());
		
		//5.
//		Xuesheng jk=new Xuesheng("李刚", "学生");
//		System.out.println(jk.print());
		
		//6.
//		Zhuohua Zh=new Zhuohua();
//		System.out.println(zh.show("灼华", "185万"));
		//7.
//		Qinghc qhc=new Qinghc();
//		System.out.println(qhc.print());
		
		//8.
//		Tv tv=new Tv();
//		System.out.println( tv.open());
//		System.out.println( tv.close());
		
		//9.
//		Bijiben dell=new Bijiben();
//		System.out.println( dell.open());
//		System.out.println( dell.play());
//		System.out.println( dell.watch());
//		System.out.println( dell.close());
		
		//10.
		
		Orange or=new Orange();
		System.out.println( or.drink());
	}

}
