/**
 * @author 程森
 *2017年8月12日下午4:10:29
 */
package jiekou;

/**
 * 测试类
 * @author 程森
 *2017年8月12日下午4:10:29
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * usb 调用
		 * 
		// TODO Auto-generated method stub
      Usb us1=new Usbdisk();
      Usb us2=new Usbfengsan();
      us1.service();
      us2.service();
		 */
		
		
		/**
		 * Door调用
		 * 
		 */
		Lockdoor ldoor=new Lockdoor();
		ldoor.close();//关门
		ldoor.lockUp();//上锁
		ldoor.openLock();//开锁
		ldoor.open();//开门
		ldoor.takephoto();//拍照
		
		
	}

}
