/**
 * @author 程森
 *2017年8月12日上午9:13:17
 */
package work3;

/**
 * 小轿车
 * @author 程森
 *2017年8月12日上午9:13:17
 */
public final class Car extends MotoVehicle {
     private int type;
     
      public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
   public Car(int no ,int type){
	   super.setNo(no);
	   this.setType(type);
	   
   }
	public String CalcRent( int days){
		double money = 0;
		 if(this.getType()==1){
			  money=days*300;
		 }else if(this.getType()==2){
			 money=days*600;
		 }
		 else if(this.getType()==3){
			 money=days*800;
		 }
    	  String str="所需租金为:"+money;
		return str;
      }
}
