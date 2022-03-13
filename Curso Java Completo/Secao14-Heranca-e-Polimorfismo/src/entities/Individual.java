package entities;

public class Individual extends Payer {

	private Double healthExpenditures;
	
	public Individual() {}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double totalTaxes() {
		double tax;
		if (super.getAnualIncome() < 20000.0) {
			tax = super.getAnualIncome() * 0.15;
		}
		else {
			
			tax = super.getAnualIncome() * 0.25;
		}
		
		if (healthExpenditures > 0) {
			tax -= healthExpenditures / 2;
		}
		
		return tax;
	}
}
