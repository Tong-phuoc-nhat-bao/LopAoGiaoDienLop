package LopAoGiaoDIen;

import java.util.Scanner;

public class Worker extends Person implements Tax {
	String name, citizenID, phone, email;
	int  salary, other_income;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, String citizenID, String phone, String email, int salary, int other_income) {
		super();
		this.name = name;
		this.citizenID = citizenID;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
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

	public int getOther_income() {
		return other_income;
	}

	public void setOther_income(int other_income) {
		this.other_income = other_income;
	}
	
	public void nhap() {
		    Scanner input = new Scanner(System.in);
			System.out.print("worker name: ");
			name=input.next();
			System.out.print("worker citizenID: ");
			citizenID=input.next();
			System.out.print("worker phone: ");
			phone=input.next();
			System.out.print("worker enmail: ");
			email=input.next();
			System.out.print("worker birthday: ");
			birthday=input.next();
			System.out.print("worker bloodtype: ");
			bloodtype=input.next();
			System.out.print("worker gender: ");
			gender=input.next();
			System.out.print("worker salary: ");
			salary=input.nextInt();
			System.out.print("worker other income: ");
			other_income=input.nextInt();
	}
	
	@Override
	public double payTax(int income, int start_time, int end_time) {
		// TODO Auto-generated method stub
		income = salary + other_income;
		start_time=1;
		end_time=0;
		if (income > 15000000) {
			return (0.01*(start_time - end_time)*income);
		}else
		{
			return 0;
		}
	}
}
