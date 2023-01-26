
public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private float experience;
	public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
		super(empId, name);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	public void calculateMonthlySalary() {
		double varComponent;
		if (experience < 3) varComponent = 0*basicPay;
		else if (experience < 5) varComponent = 0.05*basicPay;
		else if (experience < 10) varComponent = 0.07*basicPay;
		else varComponent = 0.12*basicPay; // >= 10 years of experience
		
		this.salary = this.basicPay + this.hra + varComponent;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
}
