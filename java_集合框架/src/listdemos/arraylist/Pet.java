/**
 * @author 程森
 *2017年8月15日下午2:40:45
 */
package listdemos.arraylist;

/**
 * 父类 动物
 * @author 程森
 *2017年8月15日下午2:40:45
 */
public abstract class Pet {
    private String name;
 
    
    public Pet(){
    	
    }
    public Pet(String name){
    	this.name=name;
    
    }
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    public abstract String show();
}
