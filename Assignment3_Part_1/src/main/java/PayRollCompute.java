
public class PayRollCompute implements ComputeSalary, ComputeTax {
	ComputeSalary cs;
	ComputeTax ct;
	

	public double computeTax(int amount) {
		// TODO Auto-generated method stub
		return ct.computeTax(amount);
	}

	public double weeklySalary(Employee income) {
		// TODO Auto-generated method stub
		return cs.weeklySalary(income);
	}

	public double fortnightSalary(Employee income) {
		// TODO Auto-generated method stub
		return cs.fortnightSalary(income);
	}

	public double computeKiwiSaver(Employee kiwiOption) {
		// TODO Auto-generated method stub
		return cs.computeKiwiSaver(kiwiOption);
	}
	
	public void setSalaryObj(ComputeSalary c) {
		this.cs = c;
	}
	
	public void setTaxObj(ComputeTax t) {
		this.ct = t;
	}

}
