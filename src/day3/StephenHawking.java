package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {
public static void main(String[] args) {


	
	
	
	String Master = JOptionPane.showInputDialog("How are you doin stephenHawking");
	JOptionPane. showMessageDialog(null, "Cool " + "answer");
	
			
	// 3. call the speak method below and send it the sentence
	speak(Master);
	// 4. repeat steps 2 and 3 a lot of times 
	
}	

/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
