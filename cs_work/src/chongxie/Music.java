/**
 * @author 程森
 *2017年8月16日下午5:15:27
 */
package chongxie;
/**
 * 1.子类重写父类中的方法
 * 2.方法名相同
 * 3.参数列表相同
 * 4.返回值类型相同或是其子类
 * 5.访问权限不能严于父类
 */
/**
 * @author 程森
 *2017年8月16日下午5:15:27
 */
public class Music {
      private String name;
      private String author;
      
      public String print(){
    	  this.setName("音乐");
    	  setAuthor("作者");
    	  String str=getAuthor()+"是"+getName()+"的作者";
    	  return str;
      }
      
      
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
      
      
}
