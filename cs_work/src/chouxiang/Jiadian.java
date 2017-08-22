/**
 * @author 程森
 *2017年8月17日上午9:14:52
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
 * 家电
 * @author 程森
 *2017年8月17日上午9:14:52
 */
public abstract class Jiadian {
	  private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	    
    public abstract String open();
    public abstract String close();
}
