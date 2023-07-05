package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures;
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	public double getHealthExpenditures() {
		return healthExpenditures;
	}
	
	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
