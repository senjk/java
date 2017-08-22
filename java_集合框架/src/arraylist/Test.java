/**
 * @author 程森
 *2017年8月19日上午10:03:42
 */
package arraylist;

import java.util.*;

/**
 * arraylist
 * @author 程森
 *2017年8月19日上午10:03:42
 */
public class Test {

	
	public static  void main(String[] args) {
  List<String> list=new ArrayList<String>();
      list.add("1");
      list.add("2");
      list.add("3");
      list.add("4");
      System.out.println("集合的长度："+list.size());
      for(int i=0; i<list.size();i++){
    	  System.out.print(list.get(i)+"\t");
      }
		/**List<String> liststr=new ArrayList<String>();
		liststr.add("a");
		liststr.add("a");
		liststr.add("a");
		for(String str:liststr){
			System.out.println(str);
		}*/
		
		String[] str=new String [3];
		str[0]="s";
		str[1]="s";
		str[2]="s";
		for(String str1:str){
			System.out.println(str1);
		}
	}

}
