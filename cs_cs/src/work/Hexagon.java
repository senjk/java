package work;

public class Hexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for(int i=0;i<20;i++){
//	System.out.print("*");
//}
double  r = 20;
for (double y = 0; y <= 2 * r; y+=2 ) {
   double x = Math.round(Math.sqrt(3)*Math.abs((r-y))/3);
   double longLength = 2 * (r - x);
  
   double i;
   for ( i = 0; i <= x; i++) {
   System.out.print(" ");
   
   }
   
   System.out.print("*");
//   for (double h = 0; h <= g; h++) {
//	   System.out.print(" ");
//   }
//   System.out.print("*");
   if(y==0||y==2*r||y==8){
	   for(i=0;i<9;i++){
	 
		   System.out.print("* ");
	   }
	  
   }
   if(y==8){
	   for(i=0;i<4;i++){
	 
		   System.out.print("* ");
	   }
	  
   }
   if(y==32){
	   for(i=0;i<14;i++){
	 
		   System.out.print("* ");
	   }
	  
   }
 
//	   
//  
	   
   
   for (double j = 0; j <= longLength; j++) {
	   if(y==0||y==2*r||y==8||y==32){
		  
	   }else{
		   System.out.print(" ");
	   }
   }
   System.out.print("*");
   System.out.print("\n");


}
	}

}
