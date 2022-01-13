package entities;

public class Company extends TaxPayer {

	private Integer employees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}
	
	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double totalTaxes() {
		
		if (employees > 10) {
			
			return super.getAnualIncome() * 0.14; //desconto de 14%
		}
		else {
			
			return super.getAnualIncome() * 0.16; //desconto de 16%
		}
	}
}
