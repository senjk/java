/**
 * @author 程森
 *2017年10月5日上午9:16:45
 */
package account.entity;

/**
 * @author 程森
 *2017年10月5日上午9:16:45
 */
public class Teacher {
	 private String id;  //主键
	    private String name; //姓名
	    private String schoolid;
	    private String classs;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getClasss() {
			return classs;
		}
		public void setClasss(String classs) {
			this.classs = classs;
		}
		public String getSchoolid() {
			return schoolid;
		}
		public void setSchoolid(String schoolid) {
			this.schoolid = schoolid;
		}
	    
}
