package jicheng;
/**
 * 继承   父类 Pet
 * @author 程森
 *2017年8月11日下午4:09:55
 */
   public  abstract class Pet {
   private String name;//昵称
   private int health;//健康值
   private int love;//亲密度


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

public Pet(String name,int health,int love ){
	
	this.name=name;
	this.health=health;
	this.love=love;
}
  public abstract String show();
	  
  

}
