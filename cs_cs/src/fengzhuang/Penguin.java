package fengzhuang;

public class Penguin {
	 //属性
	private static final String SEX_MALE="雄";
	private static final String SEX_FEMALE="雌";
	
		private String name;//昵称
		private int health;//健康值
		private int love;//亲密度
		private String sex;	 //性别
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
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		
		public static String getSexMale() {
			return SEX_MALE;
		}
		public static String getSexFemale() {
			return SEX_FEMALE;
		}
		public String penguin(){
			String str="企鹅的自白：\n我叫"+getName()+"\n"+
		"健康值："+getHealth()+"\n"+"与主人的亲密度："+getLove()+"\n"+
				"企鹅的性别："+getSex();	
			return str;
		}
	
	
}
