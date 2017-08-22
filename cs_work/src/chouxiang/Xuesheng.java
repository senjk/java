/**
 * @author 程森
 *2017年8月17日上午8:59:03
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
 * @author 程森
 *2017年8月17日上午8:59:03
 */
public class Xuesheng extends Xuexiao {

	public Xuesheng(String name1, String zhiwei1) {//构造方法赋值
		super(name1, zhiwei1);
		
	}

	/* (non-Javadoc)
	 * @see chouxiang.Xuexiao#print()
	 */
	@Override
	public String print() {
		String str=getName()+"的职位是"+getZhiwei();
     	return str;
	}

}
