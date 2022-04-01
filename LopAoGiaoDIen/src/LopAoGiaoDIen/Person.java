package LopAoGiaoDIen;

public abstract class Person {
	String birthday, gender, bloodtype;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String birtday, String gender, String bloodtype) {
		super();
		this.birthday = birtday;
		this.gender = gender;
		this.bloodtype = bloodtype;
	}

	public String getBirtday() {
		return birthday;
	}

	public void setBirtday(String birtday) {
		this.birthday = birtday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	
}
