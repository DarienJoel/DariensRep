package lab5;
//gets data from model and displays in UI
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.*;

public class InterestCalculatorView extends JFrame {
// properties for user interface
	private JTextField txtText,txtText2,txtText3;
	private JLabel lblInt; // label control to change and display the calculated interest
	private JButton btnCalc;
	private InterestCalculatorModel interestCalculatorModel; // model component used to access model properties/methods
	
	
	
	
	InterestCalculatorView(InterestCalculatorModel interestCalculatorModel){ // constructor 
		this.interestCalculatorModel = interestCalculatorModel;
		// creating UI
		txtText = new JTextField(10);
		txtText2 = new JTextField(10);
		txtText3 = new JTextField(10);
		lblInt = new JLabel("(Interest will go here)");
		btnCalc= new JButton("Calculate");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("Enter your principle: "));
		panel.add(txtText);
		panel.add(new JLabel("Enter your rate(ex. .05): "));
		panel.add(txtText2);
		panel.add(new JLabel("Enter the length of your term: "));
		panel.add(txtText3);
		panel.add(new JLabel("Your simple interest is: "));
		panel.add(lblInt);
		panel.add(btnCalc);
		
		this.setContentPane(panel);
		this.pack();
		this.setTitle("Interest Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// adding action listener to calculate button
	public void addBtnCalcListener(ActionListener actList) {
		btnCalc.addActionListener(actList);
		
	}
	// get methods to pull user input from text boxes to pass to model
	public double getPrinciple() {
		String prin =  txtText.getText();
		 double principle = Double.parseDouble(prin);
		 return principle;
	}
	public double getRate() {
		String prin =  txtText2.getText();
		 double principle = Double.parseDouble(prin);
		 return principle;
	}
	public double getTerm() {
		String prin =  txtText3.getText();
		 double principle = Double.parseDouble(prin);
		 return principle;
	}
	
	public void setlblSimpleInt(double reverseText)
	{
		String textTest = Double.toString(reverseText); // will display the interest 
		lblInt.setText(textTest);
	}
}
