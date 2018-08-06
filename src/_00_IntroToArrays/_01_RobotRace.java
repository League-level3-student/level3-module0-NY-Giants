package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random roborand = new Random();
		//2. create an array of 5 robots.
		Robot[] roborace = new Robot[5];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i < roborace.length; i++) {
			roborace[i] = new Robot();
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		roborace[0].setX(50);
		roborace[0].setY(550);
		roborace[1].setX(250);
		roborace[1].setY(550);
		roborace[2].setX(450);
		roborace[2].setY(550);
		roborace[3].setX(650);
		roborace[3].setY(550);
		roborace[4].setX(850);
		roborace[4].setY(550);
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    		
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		boolean raceOver = false;
		while(!raceOver) {
		for(int i = 0; i < roborace.length; i++) {
			roborace[i].setSpeed(10);
			roborace[i].move(roborand.nextInt(50));
			if(roborace[i].getY() <= 0) {
				raceOver = true;
			}
		}
		
		}
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
