package fengzhuang;
/**
 * 测试类  测试Customer
 * @author 程森
 *2017年8月11日上午9:55:21
 */
public class Cumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Customer cust=new Customer();
   cust.setName("程森");
   String str=new Customer().customer(cust.getName());
   System.out.println(str);
   
   
	}

}
