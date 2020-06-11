package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	
    public static void main(String[] args){
 
    	// This code makes a new Robot
    	Robot madi = new Robot();

        // Put the robot's pen down so it can draw
		//        Use the     rob.penDown();   command.
madi.sparkle();
madi.penDown();
        // SPEED. Make the robot move quickly.
		//        Use the     rob.setSpeed();   command.
madi.setSpeed(20);

        // DRAW.  Draw a line
    	//		Use the     rob.move(); command
for(int i = 0; i<4;i++){
madi.move(250);

		// TURN.  Turn 90 degrees
    	//      Use the     rob.turn();  command
madi.turn(90);
}
        // LOOP.  Now put the DRAW and TURN code into a for loop to repeat 4 times.
		//        Did your Robot draw a square?

}

    }

