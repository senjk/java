/**
 * @author 程森
 *2017年8月17日上午8:56:23
 */
package chouxiang;

/**
 * 学校
 * @author 程森
 *2017年8月17日上午8:56:23
 */
/**
 * 1.抽象类不能被实例化
 * 2.抽象类可以有0~多个抽象方法
 * 3.非抽象子类必须重写父类的所有抽象方法
 * 4.抽象方法没有方法体
 * 5.抽象方法必须在抽象类中
 * 
 */
public abstract class Xuexiao {
   private	String name;
  private  String zhiwei;
    public Xuexiao(String name1,String zhiwei1){///构造方法赋值
    	this.name=name1;
    	this.zhiwei=zhiwei1;
    }
    public abstract String print();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZhiwei() {
		return zhiwei;
	}
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
    	
   
}
