/**
 * @author 程森
 *2017年9月24日上午11:22:42
 */
package account.entity;

/**
 * @author 程森
 *2017年9月24日上午11:22:42
 */
public class Account {
	 private String id;  //主键
	    private String code;  //账户
	    private String name;    //姓名
	    private String password;  //密码
	  
		private String sex;
	    private String age;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
}
