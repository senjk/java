package duotai;
/**
 *  主人类
 *  @author 程森
 *2017年8月11日下午8:30:44
 */
public class Master {
	
	Pet pet=null;
    public String feed( Pet pet){
    	return pet.eat();
    	
    }
    
    //多态3.父类转换
    public Pet getPet( int typeid){
    	Pet pet=null;
    	if(typeid==1){
    		 pet=new Dog();
    	}
    	else if(typeid==2){
    		 pet=new Penguin();
    	}
    	else if(typeid==3){
    		 pet=new Cat();
    	}
    	return pet;
    }
    
    public String play(Pet pet){
    	String str = null;
    	if(pet instanceof Dog){
    		Dog dog=(Dog) pet;
    		 str= dog.feipan();
    	}
    	else if(pet instanceof Penguin){
    		Penguin pen=(Penguin)pet;
   		 str= pen.swim();
    	}
    	else if(pet instanceof Cat){
    		Cat cat=(Cat)pet;
   		 str= cat.qiu();
    	}
		return str;
    }
   
}
