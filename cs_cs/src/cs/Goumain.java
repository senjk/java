package cs;

public class Goumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str;
		Gouzao lk= new Gouzao(); 
		str=lk.kj();
		System.out.println(str);
		
		Gouzao lk1= new Gouzao("有参1"); 
		str=lk1.kj();
		System.out.println(str);
		Gouzao1 jk=new Gouzao1();
		str=jk.jk1();
		System.out.println(str);
		Gouzao1 jk1=new Gouzao1("有参2");
		str=jk1.jk1();
		System.out.println(str);
		
		Gouzao3 yhk=new Gouzao3();
		str=yhk.hk();
		System.out.println(str);
		Gouzao3 hk1=new Gouzao3("有参3","VIP");
		str=hk1.hk();
		System.out.println(str);
		
		Gouzao4 a=new Gouzao4();
		str=a.gh();
		System.out.println(str);
		Gouzao4 a1=new Gouzao4("有参4");
		str=a1.gh();
		System.out.println(str);
		
		
		
		
		  str=Gouzao5.fh();
		System.out.println(str);
//		String name="有参5";
//		String type5="VIP";
//		Gouzao5 b1=new Gouzao5(name,type5,1252);
//		str=b1.fh();
//		System.out.println(str);
	}

}
