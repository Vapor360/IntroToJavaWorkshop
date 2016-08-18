package day3;

import javax.swing.JOptionPane;

public class chooseyourownAdventure {
public static void main(String[] args) {
	String Adventure = JOptionPane. showInputDialog("Las Vegas or United kingdom");
	JOptionPane.showConfirmDialog(null, "Do you like to travel " + Adventure);
	String world = JOptionPane. showInputDialog("Would you live there or travel there?");
		JOptionPane.showConfirmDialog(null,"Whould you like the weather there?" + world);
		String own = JOptionPane.showInputDialog("Whould you like to be rich if you ever live there?");
}
}
