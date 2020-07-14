package lab5;

// this class works with data user enters on the gui
public class InterestCalculatorModel {
	// private properties used with getter and setter to retrieve(get) from model and change(set) them 
	private double principle;
	private double rate;
	private double term;
	
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public void setTerm(double term) {
		this.term = term;
	}
	public double getTerm() {
		return term;
	}
	
	public double calculateInterest() { // calculates simple interest and returns the interest where the method was called
		double interest = 0.0;
		interest = principle* rate * term;
			
	
		return interest;
		
	}


}
