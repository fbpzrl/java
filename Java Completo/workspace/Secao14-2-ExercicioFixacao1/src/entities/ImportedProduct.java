package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
		
		super(); //assegura que a subclasse estará sempre atualizada em relação à alterações na super classe
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		
		return super.getPrice() + customsFee;
	}
	
	public String priceTag() {
		
		return super.getName() + " $ " + String.format("%.2f", super.getPrice()) + 
				" (Customs Fee: $ " + 
				String.format("%.2f", customsFee) + ")";
	}
}
