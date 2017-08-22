/**
 * @author 程森
 *2017年8月17日下午2:38:00
 */
package duotai2;
/**
 * 多态定义：
 * 同一个引用类型，使用不同的实例而执行不同的操作
 */
/**
 * 多态三要素：
 * 1.具有继承关系的子类和父类
 * 2.子类重写父类的方法
 * 3.使用父类的引用指向子类的对象
 */

/**
 * 
 * 公共类 抽象多态
 * @author 程森
 *2017年8月17日下午2:38:00
 */
public class Comom {
   
   public String bw(Baowen bw){
	   return bw.baowen();
   }
   public String jh(Baowen bz){
	   return bz.jinghua();
   }
    public String add( Beizi bz){
    	return bz.addwater();
    }
    public String move( Beizi bz){
    	return bz.movewater();
    	
    }
    public Deng getdrink(int id){
   	 Deng drink=null;
   	 if(id==1){
   		 drink=new Biandeng();
   	 }else if(id==2){
   		
   		 drink=new Diand();
   	 }
   	 return drink;
    }
    public Bianhuan getdrin(int id){
      	Bianhuan drink=null;
      if(id==1){
       drink=new Biandeng();
      }
      	 return drink;
       }
    
    public String playmusic(Computer cm){
     	String str = null;
     	if(cm instanceof Bijb){
     		Bijb lion=(Bijb) cm;
     		 str= lion.playmusic();
     	}
     	else if(cm instanceof Gudingdn){
     		Gudingdn lion=(Gudingdn) cm;
    		 str= lion.playmusic();
     	}
     	
 		return str;
     }
}
