/**
 * @author 程森
 *2017年8月18日上午8:51:49
 */
package tkt;

/**
 * @author 程森
 *2017年8月18日上午8:51:49
 */

public class Test {
	
 
	public void test(int i,String s){
		i=i*3;
		System.out.println(s+"1"+i);
	}
	
	public static void main(String args[]) {
		try{
			System.out.println(1);
		}finally{
			System.out.println(2);
		}
	  Test df=new Test();
	   int i=9;
	   String s="ton";
	   df.test(i, s);
	   System.out.println(i);
	}

}
