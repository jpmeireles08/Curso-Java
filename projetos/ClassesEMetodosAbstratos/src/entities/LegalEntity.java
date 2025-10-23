package entities;

public class LegalEntity extends Person{

	private Integer employeeNumbes;
	
	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double yearlyIncome, Integer employeeNumbes) {
		super(name, yearlyIncome);
		this.employeeNumbes = employeeNumbes;
	}

	public Integer getEmployeeNumbes() {
		return employeeNumbes;
	}

	public void setEmployeeNumbes(Integer employeeNumbes) {
		this.employeeNumbes = employeeNumbes;
	}

	@Override
	public double incomeTax() {
		if (getEmployeeNumbes() <= 10) {
			return getYearlyIncome() * 0.16;
		} else {
			return getYearlyIncome() * 0.14;
		}
	}
}
