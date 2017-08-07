package cs;

public class If_For {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String str="";
if(str.equals("zhb")){
	System.out.println("你好 zhb");
}
else{
	System.out.println("你怎么还没来？");
}
for(int i=0;i<5;++i){
	System.out.println("zhb是第"+i+"次来");
}*/
		
//		for(int i=0;i<10;i++){
//			if(i==5){
//				System.out.println("你到了这里："+i);
////				continue;
////				break;
//			}
//			
//			System.out.println("正常循环"+i);
//			
//		}
		for(int i=0;i<10;i++){
			for(int j=0;j<3;j++){
				System.out.println("欢迎您买票");
				System.out.println(i+1);
			}
			if(i<5){
				System.out.println("小于5的循环："+(i+1));
				if(i<3){
					System.out.println("小于3的循环："+(i+1));
				}else{
					System.out.println("大于等于3，小于5的循环："+(i+1));
				}
//				
			}
			else{
			System.out.println("大于等于5，小于10的循环："+(i+1));
			if(i<7){
				System.out.println("小于7的循环："+(i+1));
			}else{
				System.out.println("大于等于7，小于10的循环："+(i+1));
			}
			}
		}
		
		
//		switch(1){
//		case 1:System.out.println("1");
//		}
		while(true){
			System.out.println("1");
		}

	}

}
