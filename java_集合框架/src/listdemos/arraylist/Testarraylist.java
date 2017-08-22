package listdemos.arraylist;

import java.util.*;
public class Testarraylist {


	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
	Penguin pen=new Penguin("兰兰","Q仔");
	Penguin pen1=new Penguin("娜娜","Q妹");
	Penguin pen2=new Penguin("阳阳","Q仔");
	Penguin pen3=new Penguin("楠楠","Q妹");
	Penguin pen4=new Penguin("晶晶","Q仔");
//	Penguin pen5=new Penguin("晶晶","Q仔");
	List<Penguin> lis=new ArrayList<Penguin>();   //泛型
		lis.add(pen);
		lis.add(pen1);
		lis.add(pen2);
		lis.add(pen3);
		lis.add(pen4);
		
		
//		lis.add(lis.size(),pen5 );
		 System.out.println("集合的长度："+lis.size());
		 System.out.println("--------foreach遍历------------");
		for(Object obj:lis){
		   System.out.println(((Penguin)obj).show()); 
		   
		}
		//contains 包含判断对象是否存在
		if(lis.contains(lis.get(2))){
			System.out.println("该对象存在");
			System.out.println("删除该对象");
			lis.remove(2);
			System.out.println("已删除该对象");
		}else{
			System.out.println("该对象不存在");
		}
		 System.out.println("集合的长度："+lis.size());
		for(Object obj:lis){
			 System.out.println(((Penguin)obj).show()); 
		}
		
		
		
		
		//遍历方式-----索引号遍历
		System.out.println("--------索引号遍历------------");
	for(int i=0;i<lis.size();i++){
		 Object obj=lis.get(i);
		Penguin dogs=(Penguin)obj;
		 System.out.println(dogs.show());
		}
		//删除方式1.0 按删除索引号
//		lis.remove(0);
//		//删除方式2.0按照指定的对象删除
//		 lis.remove();
		//遍历方式2.0
//		
//		
	
	
	 Set<Penguin> set=new HashSet<Penguin>();
	  set.addAll(lis);

	 System.out.println("集合的长度："+set.size());
	 System.out.println("---------Iterator遍历-------");
	 Iterator it=set.iterator();
	 while(it.hasNext()){
		 Object peng= it.next();
		 Penguin pens=(Penguin)peng;
		 System.out.println(pens.show());
		 
	 }
		
	}

}
