package entities;

public class NaturalPerson extends Person {

	private Double healthExpenses;

	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String name, Double yearlyIncome, Double healthExpenses) {
		super(name, yearlyIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double incomeTax() {
		if (getYearlyIncome() < 20000.0) {
			return ((getYearlyIncome() * 0.15) - (getHealthExpenses() * 0.5));
		} else {
			return ((getYearlyIncome() * 0.25) - (getHealthExpenses() * 0.5));
		}
	}
}
