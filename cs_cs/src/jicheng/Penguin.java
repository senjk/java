package jicheng;

public class Penguin extends Pet {
	

	private String sex;	 //性别

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public Penguin(String name, int health, int love,String sex) {
		super(name, health, love);
		this.sex=sex;
		// TODO Auto-generated constructor stub
	}
	@Override //重写方法
	public String show() {
		// TODO Auto-generated method stub
		String str="企鹅的自白："+"\n企鹅的姓名："+this.getName()+"\n健康值："+this.getHealth()+"\n亲密度："+this.getLove()+"\n性别："+this.getSex();
	    return str;
	}
	
}
