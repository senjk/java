/**
 * @author 程森
 *2017年8月17日下午2:30:09
 */
package duotai2;

import java.util.Scanner;

/**
 * 多态  抽象测试类
 * @author 程森
 *2017年8月17日下午2:30:09
 */
public class Test {
	public static void main(String[] args) {
   Scanner cin=new Scanner(System.in);
		///1.  父类作为形参实现多态   接口作为形参   instancef
	/**	Beizi bz[]=new Beizi[2];
		bz[1]=new Baowenbei();
		bz[0]=new PutBeizi();
		for(int i=0;i<bz.length;i++){
		   Comom st=new Comom();
			System.out.println(st.add(bz[i]));
			System.out.println(st.move(bz[i]));
			if(bz[i]instanceof Baowen){
			Baowen bw=(Baowen)bz[i];
			System.out.println(st.jh(bw));
			System.out.println(st.bw(bw));
			}
		}
		*/
		//2.父类做返回类型   接口作为返回类型
	/**	Comom am=new Comom();
		System.out.println("请输入1-2(1.智能电灯   2.普通灯)");
		int id=cin.nextInt();
		System.out.println(am.getdrink(id).open());
		System.out.println(am.getdrink(id).open());
		if(am.getdrin(id)instanceof Bianhuan){
			System.out.println(am.getdrin(id).liang());
			System.out.println(am.getdrin(id).an());
		}
*/

	//3.  instanceof运算符
	/**   Comom am1=new Comom();
	   Computer an[]=new Computer[2];
	   an[1]=new Bijb();
	   an[0]=new Gudingdn();
	   for(int i=0;i<an.length;i++){
		 System.out.println(am1.playmusic(an[i])); 
	    }
		*/
   
   //4.
 /**   Snake Ht=new Yanjs();
	System.out.println(Ht.eat());
	Dushe ht=new Yanjs();
	System.out.println(ht.du());
	*/
	
   
   //5.
 /**    Flower fl=new Jinyh();
     System.out.println(fl.qi());
     Yaoyong yy=new Jinyh();
     System.out.println(yy.yao());
	 */
   //6.
 /**  Kti fl=new Kongt();
   KT yy=new Kongt();
   System.out.println(fl.open());
  System.out.println(yy.timeopen());
  System.out.println(yy.timeclose());
   System.out.println(fl.close());
   */
   
   //7.
  /** Tv gg=new ReTv();
   Tvs hh=new ReTv();
   System.out.println(gg.watch1());
   System.out.println(hh.playgame());
   System.out.println(hh.guangbo());
   */
   
   //8.
   /**
   Yand g=new Yan();
   Luzui f=new Yan();
   System.out.println(g.chou());
   System.out.println(f.buguo());
   System.out.println(f.guo());
   */
   //9.
 /**  Yi b=new Yizi();
   Zhedieyi v=new Yizi();
   System.out.println(b.zuo());
   System.out.println(v.zhed());
   System.out.println(v.shifang());
   */
   //10.
/**   Car sg=new Zicar();
   Zidongjiashi zd=new Zicar();
   System.out.println(sg.kai());
   System.out.println(zd.ziopen());
   System.out.println(zd.zidaoh());
   System.out.println(zd.zizuo());
   System.out.println(zd.ziclose());
  */ 
cin.close();
	}

}
