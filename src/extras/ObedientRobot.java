package extras;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

import org.jointheleague.graphical.robot.Robot;
	
public class ObedientRobot {

	public static void main(String[] args) {
		int shape = JOptionPane.showOptionDialog(null, "What shape do you want?", "shape-drawer.exe", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
		String size = JOptionPane.showInputDialog("What size do you want?");
		int iSize = Integer.parseInt(size);
		if(shape==0) {
			drawCircle(iSize);
		}
		else if(shape==1) {
			drawSquare(iSize);
		}
		else {
			drawTriangle(iSize);
		}
	}
	
	public static void drawSquare(int size) {
		Robot bot = new Robot("batman");
		bot.penDown();
		bot.setSpeed(size/2);
		for (int i = 0; i < 4; i++) {
			bot.move(size);
			bot.turn(90);
		}
		bot.hide();
	}
	
	public static void drawTriangle(int size) {
		Robot bot = new Robot("batman");
		bot.penDown();
		bot.setSpeed(size/2);
		for (int i = 0; i < 3; i++) {
			bot.move(size);
			bot.turn(120);
		}
		bot.hide();
	}
	
	public static void drawCircle(int size) {
		Robot bot = new Robot("batman");
		bot.penDown();
		size = size/50;
		for (int i = 0; i < 360; i++) {
			bot.move(size);
			bot.turn(1);
		}
	}
	
}
