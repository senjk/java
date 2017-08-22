/**
 * @author 程森
 *2017年8月12日下午4:49:37
 */
package jiekou2;

/**
 * 普通手机 放音乐
 * @author 程森
 *2017年8月12日下午4:49:37
 */
public class CommonHandset extends Handset implements Playmusic {

	public CommonHandset(String brand, String type) {
		// TODO Auto-generated constructor stub
		super(brand, type);
	}

	/* (non-Javadoc)
	 * @see jiekou2.Playmusic#play(java.lang.String)
	 */
	@Override
	public String play(String incontent) {
		// TODO Auto-generated method stub
		
		 String str="播放音乐:"+incontent;
		 return str;
	}

	/* (non-Javadoc)
	 * @see jiekou2.Handset#sendinfo()
	 */
	@Override
	public String sendinfo() {
		// TODO Auto-generated method stub
		 String str="发送信息";
		 return str;
	}

	/* (non-Javadoc)
	 * @see jiekou2.Handset#info()
	 */
	@Override
	public String info() {
		// TODO Auto-generated method stub
		String str="手机类型为："+getType()+"\n手机品牌为："+getBrand();
        return str;
	}

	/* (non-Javadoc)
	 * @see jiekou2.Handset#call()
	 */
	@Override
	public String call() {
		// TODO Auto-generated method stub
		 String str="打电话";
		 return str;
	}

}
