/**
 * @author 程森
 *2017年8月19日上午10:25:13
 */
package listdemos.arraylist;



/**
 * @author 程森
 *2017年8月19日上午10:25:13
 */
public class Penguin extends Pet {
   private String sex;
	/* (non-Javadoc)
	 * @see listdemos.arraylist.Pet#show()
	 */

	public Penguin(String names,String string){
		super(names);
		this.sex=string;
	}
	public String show() {
		String str="昵称为"+getName()+"\t性别:"+sex;
       return str;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
