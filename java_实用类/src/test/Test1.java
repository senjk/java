/**
 * @author 程森
 *2017年8月21日下午4:40:03
 */
package test;

/**
 * @author 程森
 *2017年8月21日下午4:40:03
 */

class Am{
	String name="am";
	public void show(){
		System.out.println(name);
	}
}

class Dog extends Am{
	String name="dog";
}
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Am a=new Dog();
       System.out.println(a instanceof Dog);
       System.out.println(a instanceof Am);
     
	}

}
