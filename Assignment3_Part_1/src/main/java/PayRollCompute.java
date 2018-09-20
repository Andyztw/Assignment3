
public class PayRollCompute implements ComputeSalary, ComputeTax {
	ComputeSalary cs;
	ComputeTax ct;

	public double computeTax(double amount) {
		
		return ct.computeTax(amount);
	}

	public double weeklySalary(Employee income) {
		return cs.weeklySalary(income);
	}

	public double fortnightSalary(Employee income) {
		return cs.fortnightSalary(income);
	}

	public double computeKiwiSaver(Employee kiwiOption) {
		return cs.computeKiwiSaver(kiwiOption);
	}
	
	public void setSalaryObj(ComputeSalary c) {
		this.cs = c;
	}
	
	public void setTaxObj(ComputeTax t) {
		this.ct = t;
	}

}
