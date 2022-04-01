package LopAoGiaoDIen;

import java.util.Scanner;

public class Student extends Person implements Tax {
	String name, studentID, phone, email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String birtday, String gender, String bloodtype) {
		super(birtday, gender, bloodtype);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String studentID, String phone, String email) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void nhap() {
		    Scanner input = new Scanner(System.in);
			System.out.print("student name: ");
			name=input.next();
			System.out.print("StudentID: ");
			studentID=input.next();
			System.out.print("Student phone: ");
			phone=input.next();
			System.out.print("Student email: ");
			email=input.next();;
			System.out.print("Student birthday: ");
			birthday=input.next();
			System.out.print("Student bloodtype: ");
			bloodtype=input.next();
			System.out.print("Student gender: ");
			gender=input.next();
	}
	@Override
	public double payTax(int income, int start_time, int end_time) {
		// TODO Auto-generated method stub
		income=0;
		start_time=1;
		end_time=0;
		if (income > 11000000) {
			return (0.5/100*(start_time - end_time)*income);
		}else
		{
			return 0;
		}
	}
	
}
