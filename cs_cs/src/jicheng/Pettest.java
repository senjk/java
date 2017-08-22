package jicheng;

public class Pettest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog dog=new Dog("旺财", 100, 25, "拉布拉多");
       String str= dog.show();
       System.out.println(str);
        Penguin pen=new Penguin("兰兰", 85, 56, "雌");
       String strs= pen.show();
       System.out.println(strs);
	}

}
