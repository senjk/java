package jicheng;
/**
 * 学生
 * @author 程森
 *2017年8月11日下午4:32:57
 */
public class Xuesheng extends Xuexiao {
      private double score=0.0;//分数
      public Xuesheng(){
    	  super.strs();
    	
      }
      
      public String strs(){
    	  String strs=score+"";
    	  return strs;
      }
}
