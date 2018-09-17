
public class Employee {
	private double salary;
	//options of 3, 4, 8 percent
	private double kiwiOption;
	
	Employee(double salary, double kiwiOp){
		super();
		this.setKiwiOption(kiwiOp);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getKiwiOption() {
		return kiwiOption;
	}

	public void setKiwiOption(double kiwiOption) {
		this.kiwiOption = kiwiOption;
	}
	
}
