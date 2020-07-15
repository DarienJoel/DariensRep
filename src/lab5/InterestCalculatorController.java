package lab5;
// links together model and view components 
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterestCalculatorController {
// properties to access models properties and methods as well as access to view methods/properties
	private InterestCalculatorModel interestCalculatorModel;
	private InterestCalculatorView interestCalculatorView;
	
	InterestCalculatorController(InterestCalculatorModel interestCalculatorModel, InterestCalculatorView interestCalculatorView){
		this.interestCalculatorModel = interestCalculatorModel;
		this.interestCalculatorView = interestCalculatorView; 
		
		     // hi 
		
		    
		class ButtonListener implements ActionListener{ // button listener class used when user clicks calculates from view component 
			public void actionPerformed(ActionEvent evt) {
				interestCalculatorModel.setPrinciple(interestCalculatorView.getPrinciple()); // setting and getting each property 
				interestCalculatorModel.setRate(interestCalculatorView.getRate());
				interestCalculatorModel.setTerm(interestCalculatorView.getTerm());
				interestCalculatorView.setlblSimpleInt(interestCalculatorModel.calculateInterest()); // updating value from label to display the interest 
			}
			        
		}
		interestCalculatorView.addBtnCalcListener(new ButtonListener());
	}
	
}
