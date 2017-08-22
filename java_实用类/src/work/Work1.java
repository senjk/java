/**
 * @author 程森
 *2017年8月21日上午11:08:35
 */
package work;

/**
 * @author 程森
 *2017年8月21日上午11:08:35
 */
public class Work1 {

	public static void main(String[] args) {
		  String str1="1245";
	      String str2="1245";
	      String str3=str1;
	      String stra=new String("1452");
	      String strb=new String("1452");
	      String strc=new String(stra);
	      
	      
	      
	      if(str1==str2){
	    	  System.out.println("str1==str2");
	      }else{
	    	  System.out.println("str1!=str2");
	      }
	      if(str1==str3){
	    	  System.out.println("str1==str3");
	      }else{
	    	  System.out.println("str1!=str3");
	      }
	      if(str2==str3){
	    	  System.out.println("str2==str3");
	      }else{
	    	  System.out.println("str2!=str3");
	      }
	      
	      if(str1.equals(str2)){
	    	  System.out.println("str1(equals)str2");
	      }else{
	    	  System.out.println("str1(no equals)str2");
	      }
	      if(str1.equals(str3)){
	    	  System.out.println("str1(equals)str3");
	      }else{
	    	  System.out.println("str1(no equals)str3");
	      }
	      if(str2.equals(str3)){
	    	  System.out.println("str2(equals)str3");
	      }else{
	    	  System.out.println("str2(no equals)str3");
	      }
	      
	      if(stra==strb){
	    	  System.out.println("stra==strb");
	      }else{
	    	  System.out.println("stra!=strb");
	      }
	      if(stra==strc){
	    	  System.out.println("stra==strc");
	      }else{
	    	  System.out.println("stra!=strc");
	      }
	      if(strb==strc){
	    	  System.out.println("strb==strc");
	      }else{
	    	  System.out.println("strb!=strc");
	      }
	      
	      if(stra.equals(strb)){
	    	  System.out.println("stra(equals)strb");
	      }else{
	    	  System.out.println("stra(no equals)strb");
	      }
	      if(stra.equals(strc)){
	    	  System.out.println("stra(equals)strc");
	      }else{
	    	  System.out.println("stra(no equals)strc");
	      }
	      if(strb.equals(strc)){
	    	  System.out.println("strb(equals)strc");
	      }else{
	    	  System.out.println("strb(no equals)strc");
	      }
	       
	    
	      
	}

}
