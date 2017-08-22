/**
 * @author 程森
 *2017年8月15日上午11:43:34
 */
package animal;

/**
 * 鸭子类
 * @author 程森
 *2017年8月15日上午11:43:34
 */
public class Duck extends Animal implements Terr {
	 private int legNum=0;
	 public Duck(String name,int legNum) {
			super(name);
			this.legNum=legNum;
		}

	
	@Override
	public int getLegNum() {
		
		return legNum;
	}

	
	@Override
	public String shout() {
		String str="嘎嘎嘎....";
		return str;
	}

}
