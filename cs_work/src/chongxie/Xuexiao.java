/**
 * @author 程森
 *2017年8月16日下午2:11:18
 */
package chongxie;
/**
 * 1.子类重写父类中的方法
 * 2.方法名相同
 * 3.参数列表相同
 * 4.返回值类型相同或是其子类
 * 5.访问权限不能严于父类
 */
/**
 * @author 程森
 *2017年8月16日下午2:11:18
 */
public class Xuexiao {
    String name;
    String zhiwei;
    public Xuexiao(String name1,String zhiwei1){
    	this.name=name1;
    	this.zhiwei=zhiwei1;
    }
    public String print(){
    	String str=name+"的职位是"+zhiwei;
    	return str;
    }
}
