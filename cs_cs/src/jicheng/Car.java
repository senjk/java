package jicheng;

public class Car {
   private int site=4;
  public  Car(){
	  System.out.println("载客量是"+site+"人");
  }
public void setSite(int site) {
	this.site = site;
}
public void print(){
	System.out.println("载客量是"+site+"人");
	
}
}
