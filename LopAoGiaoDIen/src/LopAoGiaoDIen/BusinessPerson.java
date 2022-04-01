package LopAoGiaoDIen;

import java.util.Scanner;

public class BusinessPerson extends Person implements Tax {
	String name, citizenID, phone, email;
	int salary, business_income, other_income;
	
	public BusinessPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BusinessPerson(String name, String citizenID, String phone, String email, int salary, int business_income,
			int other_income) {
		super();
		this.name = name;
		this.citizenID = citizenID;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.business_income = business_income;
		this.other_income = other_income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(String citizenID) {
		this.citizenID = citizenID;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBusiness_income() {
		return business_income;
	}

	public void setBusiness_income(int business_income) {
		this.business_income = business_income;
	}

	public int getOther_income() {
		return other_income;
	}

	public void setOther_income(int other_income) {
		this.other_income = other_income;
	}

	public void nhap() {
		    Scanner input = new Scanner(System.in);
			System.out.print("business person name: ");
			name=input.next();
			System.out.print("business person citizenID: ");
			citizenID=input.next();
			System.out.print("business person phone: ");
			phone=input.next();
			System.out.print("business person email: ");
			email=input.next();;
			System.out.print("business person birthday: ");
			birthday=input.next();
			System.out.print("business person bloodtype: ");
			bloodtype=input.next();
			System.out.print("business person gender: ");
			gender=input.next();
			System.out.print("business person salary: ");
			salary=input.nextInt();
			System.out.print("business person business income: ");
			business_income=input.nextInt();
			System.out.print("business person other income: ");
			other_income=input.nextInt();
	}
	
	public BusinessPerson(String birtday, String gender, String bloodtype) {
		super(birtday, gender, bloodtype);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double payTax(int income, int start_time, int end_time) {
		// TODO Auto-generated method stub
		income = salary + business_income + other_income;
		start_time=1;
		end_time=0;
		if ((income > 11000000)&&(income<50000000)) {
			return (0.02*(start_time - end_time)*income);
		}else if (income>50000000)
		{
			return (0.03*(start_time - end_time)*income);
		} else {
			return 0;
		}
	}	
}
