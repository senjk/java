package work1;
/**
 *  封装 Dog类
 * @author 程森
 *2017年8月10日下午2:11:26
 */
public class Dog {
    //属性
	
	private String name;//昵称
	private int health;//健康值
	private int love;//亲密度
	private String strain;	 //品种
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health<0||health>100){
			System.out.println("健康值应该在0-100之间，默认值为60");
			this.health=60;
		}else{
		this.health = health;
		}
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public Dog(String names, String strains){
		this.name=names;
		this.strain=strains;
		
	}
	
	public String dog(){
		String str="狗的自白：\n我叫"+getName()+"\n"+
	"健康值："+getHealth()+"\n"+"与主人的亲密度："+getLove()+"\n"+
			"狗的品种："+getStrain();	
		return str;
	}
}
