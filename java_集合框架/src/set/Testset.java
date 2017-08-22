/**
 * @author 程森
 *2017年8月19日下午1:43:35
 */
package set;


import java.util.*;

import listdemos.arraylist.Penguin;

/**
 * @author 程森
 *2017年8月19日下午1:43:35
 */
public class Testset {
	@SuppressWarnings({  "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Penguin pen=new Penguin("兰兰","Q仔");
		Penguin pen1=new Penguin("娜娜","Q妹");
		Penguin pen2=new Penguin("阳阳","Q仔");
		Penguin pen3=new Penguin("楠楠","Q妹");
		Penguin pen4=new Penguin("晶晶","Q仔");
//		Penguin pen5=new Penguin("晶晶","Q仔");
		Set set=new HashSet();
		set.add(pen);
		set.add(pen1);
		set.add(pen2);
		set.add(pen3);
		set.add(pen4);
//		System.out.println(set.size());
		 System.out.println("集合的长度："+set.size());
		 System.out.println("---------Iterator遍历-------");
		 Iterator it=set.iterator();
		 while(it.hasNext()){
			 Object peng= it.next();
			 Penguin pens=(Penguin)peng;
			 System.out.println(pens.show());
			 
		 }
		 System.out.println("--------foreach遍历-------");
		for(Object obj:set){
		   System.out.println(((Penguin)obj).show()); 
		   
		}

	}

}
