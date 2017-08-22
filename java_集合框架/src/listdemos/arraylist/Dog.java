package listdemos.arraylist;

public class Dog extends Pet {
    private String strain;
    public Dog(){
    	
    }
 public Dog(String name,String strain){
    	super(name);
    	this.strain=strain;
    }
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	@Override
	public String show() {
		String str="昵称为"+getName()+"\t品种:"+strain;
	       return str;
	}


	
}
