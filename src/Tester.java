
public class Tester {

	public static void main(String[] args) {
		System.out.println("Name\t\tSalary");
		PermanentEmployee p = new PermanentEmployee(1, "Debanjan", 1000, 200, 3.2f);
		p.calculateMonthlySalary();
		System.out.println(p.getEmployeeName()+"\t"+p.getSalary());
		ContractEmployee c = new ContractEmployee(1, "Gourav", 10.0, 41f);
		c.calculateSalary();
		System.out.println(c.getEmployeeName()+"\t\t"+c.getSalary());
	}

}
