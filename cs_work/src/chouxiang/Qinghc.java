/**
 * @author 程森
 *2017年8月17日上午9:11:02
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
 *2017年8月17日上午9:11:02
 */
public class Qinghc extends Music {

	/* (non-Javadoc)
	 * @see chouxiang.Music#print()
	 */
	@Override
	
		  public String print(){
		  	 setName("青花瓷");
		  	  setAuthor("周杰伦");
		  	  String str=getAuthor()+"是"+getName()+"的作者";
		  	  return str;
		    }
	}


