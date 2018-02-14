package extras;

import org.jointheleague.graphical.robot.Robot;

public class ValentineRobot {
	public static void main(String[] args) {
		drawHeart();
		
	}
	
	static void drawHeart() {
		Robot ralph = new Robot("batman");
		ralph.setSpeed(10);
		ralph.moveTo(450,500);
		ralph.penDown();
		ralph.turn(35);
		ralph.move(165);
		for (int i = 0; i < 180; i++) {
			ralph.turn(-1);
			ralph.move(1);
		}
		ralph.setAngle(270);
		ralph.move(1);
		ralph.turn(55);
		for (int i = 0; i < 180; i++) {
			ralph.turn(-1);
			ralph.move(1);
		}
		ralph.move(165);
		ralph.penUp();
		ralph.moveTo(0, 0);
	}
}
