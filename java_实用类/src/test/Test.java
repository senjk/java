/**
 * @author 程森
 *2017年8月21日下午4:12:53
 */
package test;

/**
 * @author 程森
 *2017年8月21日下午4:12:53
 */
public class Test {


	public static void main(String[] args) {
		int i=1,sum=0;
		while(i<=10){
			i++;
			if(i%5==2){
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);

	}

}
