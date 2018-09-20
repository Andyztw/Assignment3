import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito; // import mockito


public class PayRollComputeTest {

	PayRollCompute myPayRoll;
	ComputeTax mockCTax;
	ComputeSalary mockCSal;
	double mySalary;
	Employee emp;
	double kiwiOp;
	double taxRate;
	
	
	@Before
	public void setUp() throws Exception {
		//creating the PayRollCompute class that use the mock interfaces
		myPayRoll = new PayRollCompute();
		
		//setting some variables
		mySalary = 60000.00;
		kiwiOp = 0.3;
		taxRate = 0.15;
		
		//creating the new employee for use in the test
		emp = new Employee(mySalary, kiwiOp);
		
		//create mock of the two interfaces object
		mockCTax = Mockito.mock(ComputeTax.class);
		mockCSal = Mockito.mock(ComputeSalary.class);
		
		//get value from employee object
		double empSal = emp.getSalary();
		double empKiwi = emp.getKiwiOption();
		
		//creating the mock of ComputeTax interface's computeTax method
		Mockito.when(mockCTax.computeTax(mySalary)).thenReturn(mySalary * taxRate);
		
		//creating the mock of ComputeSalary interface's computeKiwiSaver method
		Mockito.when(mockCSal.computeKiwiSaver(emp)).thenReturn(empSal*empKiwi);
		
		//creating the mock of ComputeSalary interface's fortnightSalary method
		Mockito.when(mockCSal.fortnightSalary(emp)).thenReturn(empSal / 26);
		
		//creating the mock of ComputeSalary interface's weeklySalary method
		Mockito.when(mockCSal.weeklySalary(emp)).thenReturn(empSal / 52);
		
		//set the mockobject to be the private objects in the PayRollCompute class
		myPayRoll.setSalaryObj(mockCSal);
		myPayRoll.setTaxObj(mockCTax);
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		myPayRoll = null;
		emp = null;
		mockCTax = null;
		mockCSal = null;
		
	}

	@Test
	public void testComputeTax() {
		assertEquals((taxRate * mySalary), myPayRoll.computeTax(mySalary), 0.01);
	}

	@Test
	public void testWeeklySalary() {
		assertEquals((mySalary/52), myPayRoll.weeklySalary(emp), 0.01);
	}

	@Test
	public void testFortnightSalary() {
		assertEquals((mySalary/26), myPayRoll.fortnightSalary(emp), 0.01);
	}

	@Test
	public void testComputeKiwiSaver() {
		assertEquals((mySalary * kiwiOp), myPayRoll.computeKiwiSaver(emp), 0.01);
	}

}
