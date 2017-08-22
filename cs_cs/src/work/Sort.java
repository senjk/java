package work;

public class Sort {
	
 public int[] sort(){
	 int p;
	 int s[] = new int[100];
	  for(int i=0;i<s.length;i++){
	   int x = (int)(Math.random()*100);
	   s[i]=x;
	  }
	 for(int i=0;i<s.length;i++){
		 for(int j=0;j<i;j++){ 
		 
		 if(s[i]>s[j]){
			 p=s[i];
			 s[i]=s[j];
			 s[j]=p;
			 
		 }
		 }
	 }
	 
	 
	 
	 return s;
 }
	
}
