package lab5;
// runs app 
public class InterestCalculatorClient {
		
	public static void main(String[] args) {
		//create instance of each of the three MVC components 
		InterestCalculatorModel  interestCalculatorModel = new InterestCalculatorModel();
		InterestCalculatorView interestCalculatorView  = new InterestCalculatorView(interestCalculatorModel);
		InterestCalculatorController interestCalculatorController = new InterestCalculatorController(interestCalculatorModel, interestCalculatorView);
		    
		interestCalculatorView.setVisible(true); // displays the view , displays the GUI for interaction 

	}

}
