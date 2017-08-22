/**
 * @author 程森
 *2017年8月19日上午11:27:12
 */
package haspmap;

import java.util.*;

import listdemos.arraylist.Penguin;

/**
 * @author 程森
 *2017年8月19日上午11:27:12
 */
public class Testiterator {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Penguin pen=new Penguin("兰兰","Q仔");
		Penguin pen1=new Penguin("娜娜","Q妹");
		Penguin pen2=new Penguin("阳阳","Q仔");
		Penguin pen3=new Penguin("阳阳","Q妹");
		Penguin pen4=new Penguin("晶晶","Q仔");
		Map peng=new HashMap();
         peng.put(pen.getName(), pen);
         peng.put(pen1.getName(), pen1);
         peng.put(pen2.getName(), pen2);
         peng.put(pen3.getName(), pen3);
         peng.put(pen4.getName(), pen4);
         
         System.out.println("使用Iterator方式遍历");
         //使用迭代器方式遍历
         Set keys=peng.keySet();
         Iterator it=keys.iterator();
         while(it.hasNext()){
        	 String key=(String)it.next();
        	 System.out.println(key);
        	 Penguin penn=(Penguin) peng.get(key);
        	System.out.println(penn.show()); 
         }
         
         System.out.println("使用foreach遍历");
         //使用foreach遍历
         for (Object key : keys) {
        	 Penguin penn=(Penguin) peng.get(key);
         	System.out.println(penn.show()); 
		}
	}

}
