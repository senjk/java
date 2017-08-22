package jiekou3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Usbinterface ud= new UDisk();
    Data data=new UDisk();
    String sd=ud.service();
    String sd1=data.data();
     System.out.println(sd+sd1); 
	}

}
