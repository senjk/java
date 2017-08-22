package jicheng;

public class Dog extends Pet {
	private String strain;	 //品种

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
  public Dog(String name,int health,int love , String strain){
	  super(name, health, love);
	  this.strain=strain;
  }
	@Override //重写方法
	public String show() {
		// TODO Auto-generated method stub
		String str="狗的自白："+"\n狗的姓名："+this.getName()+"\n健康值："+this.getHealth()+"\n亲密度："+this.getLove()+"\n品种："+this.getStrain();
	    return str;
	}
	
}
