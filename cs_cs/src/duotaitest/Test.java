/**
 * @author 程森
 *2017年8月12日下午1:26:27
 */
package duotaitest;

/**
 * @author 程森
 *2017年8月12日下午1:26:27
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xuexiao xuexiao=new Xuesheng();
		//Xuexiao xuexiao=new Laoshi();
		Common st=new Common();
		String str= st.guan(xuexiao);
		System.out.println(str);
		// 多态 父类作为返回类型
		Laoshi dd=new Laoshi();
		System.out.println(st.getxuexiao(dd).play());
		
		//instanceof 转换
		
		System.out.println(st.play(dd));
		
		
		
		
	}

}
