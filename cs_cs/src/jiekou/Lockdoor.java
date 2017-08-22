/**
 * @author 程森
 *2017年8月12日下午4:21:22
 */
package jiekou;



/**
 * 防盗门
 * @author 程森
 *2017年8月12日下午4:21:22
 */
public class Lockdoor extends Door implements Lock ,Doorball {

	/* (non-Javadoc)
	 * @see jiekou.Lock#lockUp()上锁
	 */
	@Override
	public void lockUp() {
		// TODO Auto-generated method stub
		System.out.println("上锁");

	}

	/* (non-Javadoc)
	 * @see jiekou.Lock#openLock()开锁
	 */
	@Override
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println("开锁");

	}

	/* (non-Javadoc)
	 * @see jiekou.Door#open()开门
	 */
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开门");

	}

	/* (non-Javadoc)
	 * @see jiekou.Door#close()关门
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关门");

	}

	@Override
	public void takephoto() {
		// TODO Auto-generated method stub
		System.out.println("铃铃铃...拍照");
	}

}
