package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
	
		Robot R360=new Robot();
		
		
		
           R360.penDown();
		
           R360.setSpeed(10);
		
           for (int i = 0; i < 75; i++) {
			
		
			
	           R360.setRandomPenColor();
			
	         R360.move(5*i);

	           R360.turn(360/7);
			
	           
           }		// 9. Set the pen width to i
                       
}
