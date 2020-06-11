package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {

		// Create a new Robot
		Robot leila = new Robot();
		// Set your robot's pen down
		leila.sparkle();
		leila.penDown();
		// SPEED. Set the robot to go at max speed (100)
		leila.setSpeed(50);
        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
		for(int i = 0;i<75;i++) {
				// Change the robot pen color to random
		//leila.setPenColor(Color.BLUE);
		leila.setRandomPenColor();	
			// DRAW.    Move the robot (5*i) pixels
				//          "i" is the variable in the for loop	
		leila.move(5*i);
				// TURN.    Turn the robot (360/7) degrees to the right
		leila.turn(360/3);
				// Change the robot pen width to (i)
		leila.setPenWidth(i);
		
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		}
	}
}
