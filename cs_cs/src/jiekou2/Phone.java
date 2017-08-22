/**
 * @author 程森
 *2017年8月12日下午5:03:22
 */
package jiekou2;

/**
 * @author 程森
 *2017年8月12日下午5:03:22
 */
public class Phone extends Handset implements Network, Takephotos, Playmusic {

	public Phone(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see jiekou2.Playmusic#play(java.lang.String)
	 */
	@Override
	public String play(String incontent) {
		// TODO Auto-generated method stub

		 String str="智能机播放音乐:"+incontent;
		 return str;
	}

	/* (non-Javadoc)
	 * @see jiekou2.Takephotos#takephotos()
	 */
	@Override
	public String takephotos() {
		// TODO Auto-generated method stub
		 String str="智能机拍张照";
		 return str;
		
	}

	/* (non-Javadoc)
	 * @see jiekou2.Network#networkConn()
	 */
	@Override
	public String networkConn() {
		// TODO Auto-generated method stub
		 String str="智能机上网";
		 return str;
		
	}

	/* (non-Javadoc)
	 * @see jiekou2.Handset#sendinfo()
	 */
	@Override
	public String sendinfo() {
		// TODO Auto-generated method stub
		String str="智能机发信息";
		return str;
	}

	/* (non-Javadoc)
	 * @see jiekou2.Handset#info()
	 */
	@Override
	public String info() {
		// TODO Auto-generated method stub
	String str="手机类型:"+getType()+"\n手机品牌:"+getBrand();
	return str;
	}

	/* (non-Javadoc)
	 * @see jiekou2.Handset#call()
	 */
	@Override
	public String call() {
		// TODO Auto-generated method stub
   String str="智能机打电话";
   return str;
	}

}
