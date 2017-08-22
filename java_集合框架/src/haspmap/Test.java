/**
 * @author 程森
 *2017年8月19日上午11:04:18
 */
package haspmap;

import java.util.*;


/**
 * @author 程森
 *2017年8月19日上午11:04:18
 */
public class Test {


	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map countries=new HashMap();
		countries.put("US", "美国");
		countries.put("CN", "中国");
		

		String country=(String) countries.get("CN");
		System.out.println(country);
		System.out.println("Map中共有"+countries.size()+"组数据");
		System.out.println("Map中包含CN的KEY吗？\n"+countries.containsKey("CN"));
		System.out.println("Map中包含中国的value吗？\n"+countries.containsValue("中国"));
		System.out.println(countries.keySet());
        System.out.println(countries.values());
        System.out.println(countries);
        Set keys=countries.keySet();
        Iterator it=keys.iterator();
       while(it.hasNext()){
    	   String key=(String)it.next();
    	 Object keyg= countries.get(key);
    	  System.out.println("键："+key+"\t值:"+keyg);
       }
//       countries.clear();
//       if(countries.isEmpty()){
//    	   System.out.println("已清空Map接口");
//       }
      
	}

}
