/**
 * @author 程森
 *2017年8月15日上午11:30:31
 */
package animal;

/**
 * 猫类
 * @author 程森
 *2017年8月15日上午11:30:31
 */
public class Cat extends Animal implements Terr {
  private int legNum=0;
  
	public Cat(String name,int legNum) {
		super(name);
		this.legNum=legNum;
	}
	@Override
	public int getLegNum() {
	
		return legNum;
	}

	@Override
	public String shout() {
		String str="喵喵喵....";
      return str;
	}

}
