package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

	Robot R360=new Robot(); 
    for (int i = 0; i < 4; i++) {
    R360.penDown();
    R360.setPenColor(0, 0, 255);
    R360.move(50);
		
	}
	
		
		
	}
}
