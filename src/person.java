
public class person {
	private String fullname;
	
	private int age;
	
	public person(String name, int age) {
		this.setName(name);
		this.setAge(age);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return fullname;
	}
	public void setName(String name) {
		this.fullname = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
