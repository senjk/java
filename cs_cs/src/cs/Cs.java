package cs;

public class Cs {

	public static void main(String[] args) {
		//System.out.println("北大青鸟欢迎您");
		
		
		int i = -1;
		double d=0.6789;
		float f= (float) 0.1;
		System.out.println("整型"+i);
		 System.out.println("双精度"+d);		
//		i=(int) d;
//    System.out.println("强转"+i);		
		d=i;
		System.out.println("自动转化"+d);
		double dd=0;
		System.out.println("双精度dd"+dd);
		 System.out.println("单精度"+f);	
		 
		 String str ="北大青鸟一元中心";
		 System.out.println("字符串"+str);	
		 char c='c';
		 System.out.println("字符"+c);
		 String strs="";
		 System.out.println("空字符串"+strs);
	}
}
