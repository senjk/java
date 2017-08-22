/**
 * @author 程森
 *2017年8月15日上午10:32:47
 */
package trycatch;

/**
 * @author 程森
 *2017年8月15日上午10:32:47
 */
class Person{
	 private String name="";
     private int age=0;
     private String sex="男";
     public void setSex(String sex) throws Gyichang{
    	 if("男".equals(sex)||"女".equals(sex)){
    		 this.sex=sex;
    	 }else{
    		 throw new Gyichang("性别只能是男或女");
    	 }
     }
	public void print(){
		System.out.println(this.name+"("+this.sex+","+this.age+"岁)");
	}
}
public class GyTest {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person person=new Person();
         try {
			person.setSex("male");
			person.print();
		} catch (Gyichang e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
	}

}
