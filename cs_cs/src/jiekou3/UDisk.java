/**
 * @author 程森
 *2017年8月14日上午10:07:16
 */
package jiekou3;

/**
 * UDisk
 * @author 程森
 *2017年8月14日上午10:07:16
 */
public class UDisk extends Data implements Usbinterface  {

	/* (non-Javadoc)
	 * @see jiekou3.Usbinterface#service()
	 */
	@Override
	public String service() {
		// TODO Auto-generated method stub
      String str="A硬盘";
      return str;
	}

	@Override
	public String data() {
		// TODO Auto-generated method stub
		String str="输出A数据";
		return str;
	}

}
