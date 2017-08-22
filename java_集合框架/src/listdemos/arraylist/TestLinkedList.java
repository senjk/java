/**
 * @author 程森
 *2017年8月19日下午1:31:34
 */
package listdemos.arraylist;

import java.util.LinkedList;

/**
 * @author 程森
 *2017年8月19日下午1:31:34
 */
public class TestLinkedList {

	@SuppressWarnings({  "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Penguin pen=new Penguin("兰兰","Q仔");
		Penguin pen1=new Penguin("娜娜","Q妹");
		Penguin pen2=new Penguin("阳阳","Q仔");
		Penguin pen3=new Penguin("楠楠","Q妹");
		Penguin pen4=new Penguin("晶晶","Q仔");
//		Penguin pen5=new Penguin("晶晶","Q仔");
		
LinkedList pengs=new LinkedList();
		
		pengs.add(pen1);
		pengs.add(pen2);
		pengs.add(pen4);
		pengs.addLast(pen3);
		pengs.addFirst(pen);
	
		 System.out.println("集合的长度："+pengs.size());
			for(Object obj:pengs){
				 System.out.println(((Penguin)obj).show()); 
			}
			System.out.println("获得第一个对象：");
			String str=	((Penguin)pengs.getFirst()).show();
			System.out.println(str);
			System.out.println("获得最后一个对象：");
			String strlast=	((Penguin)pengs.getLast()).show();
			System.out.println(strlast);
			System.out.println("删除第一个对象："+((Penguin)pengs.getFirst()).getName());
			pengs.removeFirst();
			System.out.println("删除最后一个对象："+((Penguin)pengs.getLast()).getName());
			pengs.removeLast();
			
			 System.out.println("集合的长度："+pengs.size());
				for(Object obj:pengs){
					 System.out.println(((Penguin)obj).show()); 
				}
	}

}
