/**
 * @author 程森
 *2017年8月12日上午9:13:40
 */
package work3;

/**
 * 公共汽车
 * @author 程森
 *2017年8月12日上午9:13:40
 */
public final class Bus extends MotoVehicle {
    private int seatCount;
     
   
	public double getSeatCount() {
		return seatCount;
	}


	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

  public Bus(int no ,int seatCount){
	  super.setNo(no);
	  this.setSeatCount(seatCount);
	  
  }
	public String CalcRent( int days){
		double money = 0;
		 if(this.getSeatCount()<=16){
			  money=days*300;
		 }else if(this.getSeatCount()>16){
			 money=days*600;
		 }
   	  String str="所需租金为:"+money;
		return str;
     }
}
