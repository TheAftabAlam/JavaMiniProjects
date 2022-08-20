
public class Student {
	private int s_id;
	private String s_nameString;
	private String s_phoneString;
	private String s_cityString;
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_nameString() {
		return s_nameString;
	}
	public void setS_nameString(String s_nameString) {
		this.s_nameString = s_nameString;
	}
	public String getS_phoneString() {
		return s_phoneString;
	}
	public void setS_phoneString(String s_phoneString) {
		this.s_phoneString = s_phoneString;
	}
	public String getS_cityString() {
		return s_cityString;
	}
	public void setS_cityString(String s_cityString) {
		this.s_cityString = s_cityString;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String s_nameString, String s_phoneString, String s_cityString) {
		super();
		this.s_nameString = s_nameString;
		this.s_phoneString = s_phoneString;
		this.s_cityString = s_cityString;
	}
	public Student(int s_id, String s_nameString, String s_phoneString, String s_cityString) {
		super();
		this.s_id = s_id;
		this.s_nameString = s_nameString;
		this.s_phoneString = s_phoneString;
		this.s_cityString = s_cityString;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_nameString=" + s_nameString + ", s_phoneString=" + s_phoneString
				+ ", s_cityString=" + s_cityString + "]";
	}
	
	
}
