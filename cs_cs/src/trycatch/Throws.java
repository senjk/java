package trycatch;

public class Throws {
	@SuppressWarnings("finally")
	public String th(){
         String str="abc";
         try{
        	 int a=Integer.parseInt(str);
        	 System.out.println(a);
         }catch(Exception ex){
        	 ex.getMessage();
        	 ex.printStackTrace();
        	 String strss="12";
        	System.out.println(strss);
        	
         }finally{
        	 final String strs="34";
        	 return strs;
         }
	}
}
