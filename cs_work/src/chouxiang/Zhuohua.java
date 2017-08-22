/**
 * @author 程森
 *2017年8月17日上午9:04:23
 */
package chouxiang;
/**
 * 1.抽象类不能被实例化
 * 2.抽象类可以有0~多个抽象方法
 * 3.非抽象子类必须重写父类的所有抽象方法
 * 4.抽象方法没有方法体
 * 5.抽象方法必须在抽象类中
 * 
 */
/**
 * 灼华公司
 * @author 程森
 *2017年8月17日上午9:04:23
 */
public class Zhuohua extends Conpany {

	/* (non-Javadoc)
	 * @see chouxiang.Conpany#show(java.lang.String, java.lang.String)
	 */
	@Override
	 public String show(String names,String monets){
   	 setName(names);
   	setMoney(monets);
   	 String str="公司名：\t注册资金：\n"+getName()+"\t"+getMoney();
   	 return str;
    }

}
