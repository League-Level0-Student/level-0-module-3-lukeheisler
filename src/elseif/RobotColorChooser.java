
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	
	public static void main(String[] args) {
		Robot robot = new Robot("batman");
		robot.setSpeed(10);
		//3. ask the user what color they would like the robot to draw
		for (int i = 0; i < 50; i++) {
			
		int o = JOptionPane.showOptionDialog(null, "What colour do you want?", "Luke x Ralph <3", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Red", "Green", "Blue" }, null);
		//4. use an if/else statement to set the pen color that the user requested
		if(o==0) {
			robot.setPenColor(255,0,0);
		}
		else if(o==1) {
			robot.setPenColor(0,255,0);
		}
		else if(o==2) {
			robot.setPenColor(0,0,255);
		}
        //5. if the user doesn’t enter anything, choose a random color
		else {
			robot.setRandomPenColor();
		}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		robot.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
		robot.penDown();
		for (int z = 0; z < 4; z++) {
			robot.turn(45);
			robot.move(90);
		}
		robot.turn(90);
		}
		

	}
}
