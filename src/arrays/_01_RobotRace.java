package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] rob = new Robot[5];
		int[] turnNum = {0,0,0,0,0};
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setSpeed(10);
			rob[i].miniaturize();
			
		}
		for (int i = 0; i < rob.length; i++) {
			rob[i].turn(90);
			rob[i].setY(80+20*i);
			rob[i].setX(300);
		}

		Random ran = new Random();

		boolean isFinished = false;
		for (;;) {
			for (int i = 0; i < rob.length; i++) {
				int num = ran.nextInt(3);
				for (int j=0;j<num;j++) {
				rob[i].move(ran.nextInt(3)+1);
				rob[i].turn(1);				
				}
				turnNum[i]+=num;
				if (turnNum[i]>360) {
					isFinished = true;
					if (isFinished) {
						JOptionPane.showMessageDialog(null, rob[i]+" has won!!");
						break;
					}
				}
			}
			if (isFinished) {
				break;
			}
		}

	}
}
// 2. create an array of 5 robots.

// 3. use a for loop to initialize the robots.

// 4. make each robot start at the bottom of the screen, side by side, facing up

// 5. use another for loop to iterate through the array and make each robot move
// a random amount less than 50.

// 6. use a while loop to repeat step 5 until a robot has reached the top of the
// screen.

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
