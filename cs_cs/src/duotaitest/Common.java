/**
 * @author 程森
 *2017年8月12日下午1:26:12
 */
package duotaitest;



/**
 * @author 程森
 *2017年8月12日下午1:26:12
 */
public class Common {
   public String guan(Xuexiao xuexiao){
	 String str=  xuexiao.play();
	 return str;
   }
   
   public Xuexiao getxuexiao(Xuexiao xuexiao){
	   return xuexiao;
   }
   
   
   public String play(Xuexiao xuexiao){
   	String str = null;
   	if(xuexiao instanceof Xuesheng){
   		Xuesheng dog=(Xuesheng) xuexiao;
   		 str= dog.play();
   	}
   	else if(xuexiao instanceof Laoshi){
   		Laoshi pen=(Laoshi)xuexiao;
  		 str= pen.play();
   	}
   
		return str;
   }
   
   
}
